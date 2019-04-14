package com.alten.RPC;

import java.util.Collection;

import com.alten.dto.VehicleDetailsDTO;

/**
 * This is the RPC interface that is exposed through AMQP, to the other services
 * Exposes methods : getVehicleDetails(), which returns a list of {@link VehicleDetailsDTO}
 * 
 * @author sachini
 *
 */
public interface CustomerRPCService {
	/**
	 * @return Collection<{@link VehicleDetailsDTO}> of all vehicles
	 * @throws Exception
	 */
	public Collection<VehicleDetailsDTO> getVehicleDetails()throws Exception;

}
