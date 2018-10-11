package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Customer> customers = customerService.getCustomers();
		
		theModel.addAttribute("listOfCustomers",customers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String addCustomerForm(Model theModel) {
		Customer c = new Customer();
		theModel.addAttribute("newCustomer", c);
		
		return "add-customer";
	}
	
	@PostMapping("/addForm")
	public String addCustomer(@ModelAttribute("newCustomer") Customer customer) {
		
		customerService.addCustomer(customer);
		
		return  ("redirect:/customer/list");
	}
	
	@GetMapping("/showFormForUpdate")
	public String updateCustomerForm(@RequestParam("customerId") int id,Model theModel) {
		Customer c = customerService.getCustomer(id);
		theModel.addAttribute("newCustomer", c);
		
		return "add-customer";
	}

	
	@PostMapping("/updateForm")
	public String updateCustomer(@ModelAttribute("newCustomer") Customer customer) {
		
		System.out.println(customer.getId());
		customerService.updateCustomer(customer);
		
		return  ("redirect:/customer/list");
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		
		customerService.deleteCustomer(id);
		
		return  ("redirect:/customer/list");
	}
}
