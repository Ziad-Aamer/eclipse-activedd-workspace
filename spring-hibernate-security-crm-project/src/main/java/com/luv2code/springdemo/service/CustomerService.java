package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public void addCustomer(Customer c);
	public Customer getCustomer(int id);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);

}
