package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	public void addCustomer(Customer c);
	public Customer getCustomer(int id);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
}
