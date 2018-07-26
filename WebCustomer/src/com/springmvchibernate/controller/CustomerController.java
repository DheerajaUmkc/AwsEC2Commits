package com.springmvchibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvchibernate.entity.Customer;
import com.springmvchibernate.service.CustomerService;

@Controller
	@RequestMapping("/customer")
	public class CustomerController {

		@Autowired
		private CustomerService customerService;
		
		@GetMapping("/view")
		public String listAllCustomers(Model m) {

			m.addAttribute("customerList",customerService.listCustomers());
			
			return "list-customers";
		}
		
		@GetMapping("/add")
		public String addCustomers(Model m) {

	//		m.addAttribute("customerList",customerService.addCustomers(null));
			
			return "list";
		}
		
	}


