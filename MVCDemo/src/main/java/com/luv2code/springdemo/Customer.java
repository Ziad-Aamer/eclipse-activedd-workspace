package com.luv2code.springdemo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.luv2code.springdemo.validation.CourseCode;

public class Customer {
	
	
	private String firstName;
	@NotNull(message="is Required")
	private String lastName;
	
	@Min(value=2,message="Don't Enter Value Less than 2")
	@NotNull(message="is required")
	private Integer freePasses;
	
	@CourseCode
	private String courseCode;
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
