package com.alten.customerservice.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alten.customerservice.domain.Vehicle;
import com.alten.dto.CustomerVehiclesDTO;
import com.alten.dto.VehicleDetailsDTO;

/**
 * @author sachini
 *
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	
	@Query("select new com.alten.dto.CustomerVehiclesDTO(v.customer.customerName as name, v.VIN as vehicleId, v.regNo as registrationNo) from Vehicle v")
	public Collection<CustomerVehiclesDTO> getVehicles();

	@Query("select new com.alten.dto.VehicleDetailsDTO(v.regNo, v.address) from Vehicle v")
	public Collection<VehicleDetailsDTO> getVehicleDetails();
}
