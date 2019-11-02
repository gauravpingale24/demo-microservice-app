package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.Repository.CustomerRepository;
import com.microservice.bean.Customer;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	CustomerRepository repo;
	
	@PostMapping(value="/create")
	public String insertCustomer(@RequestBody Customer customer)
	{
		repo.save(customer);
		return "customer entry created";
	}
	
	@GetMapping(value="/getmsg")
	public String getmsg()
	{
		return "hello";
	}
}
