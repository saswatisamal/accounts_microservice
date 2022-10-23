package com.in30minutes.accounts;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(value= {"com.in30minutes.repository"})
@EntityScan({"com.in30minutes.model"})
public class AccountsApplication {
	static Logger logger=LoggerFactory.getLogger(AccountsApplication.class);
	

	public static void main(String[] args) {
		logger.info("Accounts Microservice::::::");
		System.out.println("Hello");ßß
		SpringApplication.run(AccountsApplication.class, args);
	}

}
