package com.alten.vehicle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alten.customerservice.service.CustomerService;
import com.alten.customerservice.service.VehicleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehicleServiceApplicationTests {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	VehicleService vehicleService;
	
	@Test
	public void contextLoads() {
		try {
			
			//-------------------------1-------------------------
//			Customer customer = new Customer();
//			customer.setCustomerName("Kalles Grustransporter AB");
//			customer.setCustomerAddress("Cementvägen 8, 111 11 Södertälje");
//			customer = customerService.saveCustomer(customer);
//			
//			Vehicle vehicle = new Vehicle();
//			vehicle.setRegNo("ABC123");
//			vehicle.setVIN("YS2R4X20005399401");
//			vehicle.setAddress("9000");
//			vehicle.setCustomer(customer);
//			vehicle=vehicleService.saveVehicle(vehicle);
//			
//			Vehicle vehicle2 = new Vehicle();
//			vehicle2.setRegNo("DEF456");
//			vehicle2.setVIN("VLUR4X20009093588");
//			vehicle2.setAddress("9001");
//			vehicle2.setCustomer(customer);
//			vehicle2=vehicleService.saveVehicle(vehicle2);
//			
//			Vehicle vehicle3 = new Vehicle();
//			vehicle3.setRegNo("GHI789");
//			vehicle3.setVIN("VLUR4X20009048066");
//			vehicle3.setAddress("9002");
//			vehicle3.setCustomer(customer);
//			vehicle3=vehicleService.saveVehicle(vehicle3);
////			
//
//		//------------------------------------------------------------2----------------------------------------------------------	
//			Customer customer2 = new Customer();
//			customer2.setCustomerName("Johans Bulk AB");
//			customer2.setCustomerAddress("Balkvägen 12, 222 22 Stockholm");
//			customer2 = customerService.saveCustomer(customer2);
//			
//			Vehicle vehicle4 = new Vehicle();
//			vehicle4.setRegNo("JKL012");
//			vehicle4.setVIN("YS2R4X20005388011");
//			vehicle4.setAddress("9003");
//			vehicle4.setCustomer(customer2);
//			vehicle4=vehicleService.saveVehicle(vehicle4);
//			
//			Vehicle vehicle5 = new Vehicle();
//			vehicle5.setRegNo("MNO345");
//			vehicle5.setVIN("YS2R4X20005387949");
//			vehicle5.setAddress("9004");
//			vehicle5.setCustomer(customer2);
//			vehicle5=vehicleService.saveVehicle(vehicle5);
//			
//
//	//------------------------------------------------------------3--------------------------------------------		
//			Customer customer3 = new Customer();
//			customer3.setCustomerName("Haralds Värdetransporter AB");
//			customer3.setCustomerAddress("Budgetvägen 1, 333 33 Uppsala");
//			customer3 = customerService.saveCustomer(customer3);
//			
//			Vehicle vehicle6 = new Vehicle();
//			vehicle6.setRegNo("PQR678");
//			vehicle6.setVIN("VLUR4X20009048066");
//			vehicle6.setAddress("9004");
//			vehicle6.setCustomer(customer3);
//			vehicle6=vehicleService.saveVehicle(vehicle6);
//			
//			Vehicle vehicle7 = new Vehicle();
//			vehicle7.setRegNo("STU901");
//			vehicle7.setVIN("YS2R4X20005387055");
//			vehicle7.setAddress("9004");
//			vehicle7.setCustomer(customer3);
//			vehicle7=vehicleService.saveVehicle(vehicle7);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
