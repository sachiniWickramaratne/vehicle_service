package com.alten.vehicle;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.alten.customerservice.service.VehicleService;
import com.alten.dto.CustomerVehiclesDTO;
/**
 * @author sachini
 * 13.04.2019
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest
@TestPropertySource("classpath:application-test.properties")

public class VehicleApiTest {

	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	VehicleService vehicleService;
	
	@Test
	public void getAllVehicles()throws Exception{
		CustomerVehiclesDTO customerVehiclesDTO = 
				new CustomerVehiclesDTO("Kalles Grustransporter AB", "YS2R4X20005399401", "ABC123");
		Collection<CustomerVehiclesDTO> collection = Arrays.asList(customerVehiclesDTO);
        
		given(vehicleService.getAllVehicles()).willReturn(collection);
			
		this.mockMvc.perform(get("/getAllVehicles"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'name': 'Kalles Grustransporter AB','vehicleId': 'YS2R4X20005399401';'registrationNo': 'ABC123'}]"));


	}
}
