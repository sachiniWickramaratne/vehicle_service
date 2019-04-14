package com.alten;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alten.RPC.CustomerRPCService;
import com.alten.customerservice.service.VehicleService;
import com.alten.dto.VehicleDetailsDTO;

/**
 * @author sachini
 *
 */
@Component
public class CustomerRpcServiceImpl implements CustomerRPCService{

	@Autowired
	VehicleService vehicleService;
	
	@Override
	public Collection<VehicleDetailsDTO> getVehicleDetails() throws Exception {
		return vehicleService.getVehicleDetails();
	}

}
