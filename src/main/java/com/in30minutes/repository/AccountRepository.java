package com.in30minutes.repository;

import org.springframework.data.repository.CrudRepository;

import com.in30minutes.model.Accounts;

import java.util.List;

public interface AccountRepository extends CrudRepository<Accounts,Long> {
  List<Accounts> findByCustomerId(int customerId);
	
}
