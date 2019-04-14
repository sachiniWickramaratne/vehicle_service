package com.alten.customerservice.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alten.customerservice.domain.Vehicle;
import com.alten.customerservice.repo.VehicleRepository;
import com.alten.customerservice.service.VehicleService;
import com.alten.dto.CustomerVehiclesDTO;
import com.alten.dto.VehicleDetailsDTO;

import redis.clients.jedis.Jedis;

/**
 * @author sachini
 *
 */
@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	VehicleRepository vehicleRepository;
	
	@Value("${spring.redis.host}")
    private String REDIS_HOST;

    @Value("${spring.redis.port}")
    private int REDIS_PORT;
	@Override
	public Vehicle saveVehicle(Vehicle vehicle) throws Exception {
		return vehicleRepository.save(vehicle);
	}
	
	@Override
	public Collection<CustomerVehiclesDTO> getAllVehicles() throws Exception {
		Collection<CustomerVehiclesDTO>  collection = vehicleRepository.getVehicles();
		
		try {
			Jedis jedis = new Jedis(REDIS_HOST, REDIS_PORT);
			collection.forEach(vehicle->{ 
				vehicle.setStatus(null!=(jedis.get(vehicle.getRegistrationNo())) ?
						Integer.parseInt(jedis.get(vehicle.getRegistrationNo())):0); 
			 });
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return collection;
	}

	@Override
	public Collection<VehicleDetailsDTO> getVehicleDetails() throws Exception {
		return vehicleRepository.getVehicleDetails();
	}
}
