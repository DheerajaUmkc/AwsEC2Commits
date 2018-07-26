package com.springmvchibernate.dao;


import java.util.List;


import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvchibernate.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {
		
		Session session=sessionFactory.getCurrentSession();
		Query<Customer> query=session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}


	@Override
	public List<Customer> addCustomer(Customer c) {
	
		Session session=sessionFactory.getCurrentSession();

		//Query qry = session.createQuery("insert into Customer(first_name,last_name,email) select i.first_name,i.last_name,i.email from Items i where i.itemId= ?");
		
		/*Customer cust = new Customer();
		cust.setFirst_name("dj");
		cust.setLast_name("v");
		cust.setEmail("Dj@gmail.com");
                 */
        //Save the employee in database

        session.save(c);
        Query<Customer> query=session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}
	
	
	@Override
	public List<Customer> updateCustomer(int id) {
	
		Session session=sessionFactory.getCurrentSession();
		Customer c = session.get(Customer.class, id);
		c.setEmail("fd@gmail.com");
		c.setFirst_name("changed");
		
        Query<Customer> query=session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}
	
	
	/*@Override
	public List<Customer> deleteCustomer(int id) {
	
		Session session=sessionFactory.getCurrentSession();
	
		Customer c = session.get(Customer.class, id);		
		session.delete(c);
		
        Query<Customer> query=session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}*/
	
	
}
