package com.springmvchibernate.service;


import java.util.List;

import com.springmvchibernate.entity.Customer;

public interface CustomerService {

	public List<Customer> listCustomers();
	public List<Customer> addCustomer(Customer c);
	public List<Customer> updateCustomer(int  id);
	public List<Customer> deleteCustomer(int id);
}
