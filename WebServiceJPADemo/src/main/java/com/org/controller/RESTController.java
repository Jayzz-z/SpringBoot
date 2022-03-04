package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.demo.data.Customer;
import com.org.service.CustomerService;

@RestController
public class RESTController {
	@Autowired
	private CustomerService customerService;


@PutMapping("/customers/{​​​​​id}​​​​​")

     public ResponseEntity<?> saveResource(@RequestBody Customer customer,
     @PathVariable("id") String id) {
	 Customer newCustomer = customerService.saveCustomer(customer,id);
     return new ResponseEntity<>(newCustomer,HttpStatus.OK);
     }
@PatchMapping("/customers/{​​​​​id}")
public ResponseEntity<?> updaResponse(@RequestParam("email") String email, @PathVariable("id")String id){
  Customer newCustomer = customerService.updateCustomer(email,id);
  return new ResponseEntity<>(newCustomer, HttpStatus.OK);
  }​​​​​

}​​​​​

