package com.springmvchibernate.dao;

import java.util.List;

import com.springmvchibernate.entity.Customer;


public interface CustomerDAO {

	public List<Customer> getCustomers();
	public List<Customer> addCustomer(Customer c);
	public List<Customer> updateCustomer(int id);
	public List<Customer> deleteCustomer(int id);
	
}
