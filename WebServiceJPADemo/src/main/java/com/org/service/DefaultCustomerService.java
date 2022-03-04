package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.demo.data.Customer;
import com.org.demo.jpa.CustomerRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class DefaultCustomerService implements CustomerService {

	@Autowired
	CustomerRepository customerrepository;
	
	@Override
	public Customer saveCustomer(Customer customer, String id) {
		
	 try {
		 Optional<Customer> originalCustomer = CustomerRepository.findById(Long.valueOf(id));
		
	} catch (NumberFormatException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 return customerRepository.save(customer);
	}
	
	
	@Override
	public Customer updateCustomer(String email, Srting id);
	Optional<Customer> originalCustomer = customerRepository.findById(Long.valueOf(id));
	Customer customer = originalCustomer.get();
	customer.SetEmail(email);
	return customerRepository.save(customer);
	
}
