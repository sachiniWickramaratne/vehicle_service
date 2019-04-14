package com.alten.customerservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alten.customerservice.domain.Customer;
import com.alten.customerservice.repo.CustomerRepository;
import com.alten.customerservice.service.CustomerService;

/**
 * @author sachini
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepsitory;
	
	@Override
	public Customer saveCustomer(Customer customer) throws Exception{
		return customerRepsitory.save(customer);
	}

}
