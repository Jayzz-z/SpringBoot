package com.org.controller;
import com.org.demo.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.demo.data.Customer;
import com.org.demo.data.Registration;
import com.org.service.CustomerService;

public class RegController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/new-registration")
	public @ResponseBody Customer register(@RequestBody Registration registration) {
		return customerService.saveCustomer(mapCustomerData(registration));
	}
	
	private Customer mapCustomerData(Registration registration) {
		Customer customer = new Customer(registration.getFirstname(),registration.getLastName(),registration.getEmail());

		return customer;
		}
	}


​​​​​