package com.in30minutes.repository;

import org.springframework.data.repository.CrudRepository;

import com.in30minutes.model.Customer;

public interface CustomerRepository  extends CrudRepository<Customer,Integer>{

}
