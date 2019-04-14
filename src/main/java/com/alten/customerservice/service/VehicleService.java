package com.alten.customerservice.service;

import java.util.Collection;

import com.alten.customerservice.domain.Vehicle;
import com.alten.dto.CustomerVehiclesDTO;
import com.alten.dto.VehicleDetailsDTO;

/**
 * @author sachini
 *
 */
public interface VehicleService {

		public Vehicle saveVehicle(Vehicle vehicle) throws Exception;
		
		public Collection<CustomerVehiclesDTO> getAllVehicles()throws Exception;
		
		public Collection<VehicleDetailsDTO> getVehicleDetails()throws Exception;
}
