package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;
import com.luv2code.springdemo.exception.StudentErrorResponse;
import com.luv2code.springdemo.exception.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	List<Student> students = new ArrayList<Student>();
	
	@PostConstruct
	public void loadData() {
		
		students.add(new Student("Ahmed", "Mohamed"));
		students.add(new Student("Yassin", "Jaber"));
		students.add(new Student("sow", "Monshar"));
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return students; 
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id){
		
		if(id<0 || id>=students.size())
			throw new StudentNotFoundException("Student with this id was not found:" + id);
		
		return students.get(id); 
	}

}
