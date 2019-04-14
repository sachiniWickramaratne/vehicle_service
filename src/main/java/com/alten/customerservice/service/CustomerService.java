package com.alten.customerservice.service;

import com.alten.customerservice.domain.Customer;

/**
 * @author sachini
 *
 */
public interface CustomerService {

	public Customer saveCustomer(Customer customer) throws Exception;
		
}
