package com.in30minutes.accounts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in30minutes.model.Accounts;
import com.in30minutes.repository.AccountRepository;
import java.util.List;



@RestController
public class AccountsController {

	@Autowired
	private AccountRepository repository;
	
	
	@PostMapping("/myAccount")
	public Accounts accountDetails(@RequestBody(required=true) Accounts accounts) {
		return (Accounts)repository.save(accounts);
			
	}
	
	@GetMapping("/myAccounts/{customerId}")
	public List<Accounts> accountDetails(@PathVariable String customerId) {
		List<Accounts> accts=repository.findByCustomerId(Integer.parseInt(customerId));
		if(accts!=null && accts.size()>0) {
			return accts;
		}
		return null;
	}
}
