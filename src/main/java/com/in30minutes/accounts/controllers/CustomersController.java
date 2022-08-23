package com.in30minutes.accounts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in30minutes.model.Customer;
import com.in30minutes.repository.CustomerRepository;

@RestController
public class CustomersController {
	
	@Autowired
	private CustomerRepository customersRepo;
	
	
	@PostMapping(value= {"/mycustomers"})
	public Customer customerData(@RequestBody(required=true) Customer customer) {
		Customer entity=(Customer)customersRepo.save(customer);
		if(entity!=null)
		return entity;
		else
			return null;
	}
	
	
	@PutMapping(value= {"/modifyCust"})
	public Customer modifyCustomerData(@RequestBody(required=true) Customer customer) {
		Customer entity=(Customer)customersRepo.save(customer);
		if(entity!=null)
		return entity;
		else
			return null;
	}

}
