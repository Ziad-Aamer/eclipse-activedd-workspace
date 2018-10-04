package com.luv2code.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
		implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		
		if(theCode==null)
			return true;
		
		boolean result = theCode.startsWith(coursePrefix);
		return result;
	}
	
	
}
