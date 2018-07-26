	package com.springmvchibernate.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvchibernate.entity.Customer;
import com.springmvchibernate.service.CustomerService;
import com.sun.org.glassfish.external.statistics.annotations.Reset;

@RestController
@RequestMapping("/customerrest")
public class CustomerRestController {
	
	@Autowired 
	CustomerService customerService;

	@RequestMapping("/hello")
	public String getHello() {
		return "Hello";
		
	}
	
	@GetMapping("/list")
	@ResponseBody
	public List<Customer> getCustomerList(){
		
		return customerService.listCustomers();
		
	}
	
	@PostMapping("/add")
	public List<Customer> saveCustomer(@RequestBody Customer customer) {
	   return customerService.addCustomer(customer);
		
	}
	
	@PutMapping("/update")
	public List<Customer> updateCustomer(@RequestBody int id) {
		
		return customerService.updateCustomer(id);
	}
	
	@DeleteMapping("/delete")
	public List<Customer> deleteCustomer(@RequestBody int id) {
		return customerService.deleteCustomer(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}