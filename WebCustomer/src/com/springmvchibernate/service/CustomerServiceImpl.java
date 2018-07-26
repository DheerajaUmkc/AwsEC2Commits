package com.springmvchibernate.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvchibernate.dao.CustomerDAO;
import com.springmvchibernate.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO customerdao;
	
	@Override
	@Transactional
	public List<Customer> listCustomers() {
		
		return customerdao.getCustomers();
	}

	@Override
	@Transactional
	public List<Customer> addCustomer(Customer c) {

		return customerdao.addCustomer(c);
			
	}
	
	@Override
	@Transactional
	public List<Customer> updateCustomer(int id) {

	return	customerdao.updateCustomer(id);
		
	}
	
	@Override
	@Transactional
	public List<Customer> deleteCustomer(int id) {

		return customerdao.deleteCustomer(id);

	}

}
