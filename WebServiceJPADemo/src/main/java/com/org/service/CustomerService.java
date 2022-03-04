package com.org.service;

import com.org.demo.*;
import com.org.demo.data.Customer;
public interface CustomerService {

	public Customer saveCustomer( Customer customer , String id);
	public Customer updateCustomer(String email , String id);
	public Customer saveCustomer(Customer customer);
}
