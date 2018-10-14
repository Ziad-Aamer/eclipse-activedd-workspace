package com.luv2code.springdemo.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.exception.CustomerNotFoundException;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		
		return customerService.getCustomers();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomers(@PathVariable int customerId){
		
		Customer customer = customerService.getCustomer(customerId);
		if(customer == null)
			throw new CustomerNotFoundException("Customer Not Found With this id:" + customerId);
		
		return customer;
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> setCustomer(@RequestBody Customer theCustomer) {
		System.out.println(theCustomer);
		theCustomer.setId(0);
		Customer customer = customerService.saveCustomer(theCustomer);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(customer);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {
				
		return customerService.saveCustomer(theCustomer);
	}
	
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId){
		
		Customer customer = customerService.getCustomer(customerId);
		if(customer == null)
			throw new CustomerNotFoundException("Customer Not Found With this id:" + customerId);
		
		customerService.deleteCustomer(customerId);
		
		return "Deleted Customer with id:" + customerId;
	}
	
}
