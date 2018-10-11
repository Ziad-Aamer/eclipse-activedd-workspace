package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDAO; 
	
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		
		List<Customer> customers = customerDAO.getCustomers();
		
		return customers;
	}

	@Transactional
	@Override
	public void addCustomer(Customer c) {
		customerDAO.addCustomer(c);
		
	}

	@Transactional
	@Override
	public Customer getCustomer(int id) {
		
		return customerDAO.getCustomer(id);
	}
	
	@Transactional
	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.updateCustomer(customer);
	}

	@Transactional
	@Override
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		
	}

}
