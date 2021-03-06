package com.luv2code.springdemo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String Country;
	private String[] favOs;
	
	
	private LinkedHashMap<String, String> coOptions;
	public Student() {
		super();
		 coOptions = 
				new LinkedHashMap<String, String>();
		coOptions.put("IN", "india");
		coOptions.put("UK", "United Kingdom");
		coOptions.put("EGY", "EGYt");
		coOptions.put("X", "Xeraphol");
		// TODO Auto-generated constructor stub
	}
	
	public LinkedHashMap<String, String> getCoOptions() {
		return coOptions;
	}

	public void setcoOptions(LinkedHashMap<String, String> coOptions) {
		this.coOptions = coOptions;
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	public String[] getFavOs() {
		return favOs;
	}

	public void setFavOs(String[] favOs) {
		this.favOs = favOs;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", Country=" + Country + "]";
	}

	
	
}
