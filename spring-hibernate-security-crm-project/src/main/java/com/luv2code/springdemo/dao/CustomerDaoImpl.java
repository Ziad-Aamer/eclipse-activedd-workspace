package com.luv2code.springdemo.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CustomerDaoImpl(){
		
	}

		
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		List<Customer> customers = 
				session.createQuery("from Customer order by lastName",Customer.class).getResultList();
		
		return customers;
	}


	@Override
	public void addCustomer(Customer c) {
		Session session = sessionFactory.getCurrentSession();
		
		 session.saveOrUpdate(c);
		
		System.out.println("Customer Added with id: " + c.getId());
		
	}


	@Override
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Customer.class, id);
	}

	
	@Override
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
	}


	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		session.createQuery("delete from Customer i where i.id=:id" )
				.setParameter("id", id)
				.executeUpdate();
		
	}
}
