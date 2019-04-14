package com.alten.customerservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alten.customerservice.domain.Customer;

/**
 * @author sachini
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	

}
