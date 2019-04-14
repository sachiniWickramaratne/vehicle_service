package com.alten.customerservice.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alten.customerservice.service.VehicleService;
import com.alten.dto.CustomerVehiclesDTO;

/**
 * @author sachini
 *
 */
@RestController
@CrossOrigin
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@Value("${spring.redis.host}")
    private String REDIS_HOST;

    @Value("${spring.redis.port}")
    private int REDIS_PORT;
    
	@GetMapping("/getAllVehicles")
	public Collection<CustomerVehiclesDTO> getAllVehicles(){
		Collection<CustomerVehiclesDTO> collection = new ArrayList<CustomerVehiclesDTO>();
		try {
			collection = vehicleService.getAllVehicles();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return collection;
	}
	
}
