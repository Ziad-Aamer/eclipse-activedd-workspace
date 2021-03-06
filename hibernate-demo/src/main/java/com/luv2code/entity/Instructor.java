package com.luv2code.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

@Entity
@Table(name="instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_details_id_REF")
	private InstructorDetails instructorDetails;
	
	//By adding the @JoinColumn(name="instructor_id"), now we instead of having new table created
	//we set this column to be at the course table as a FK (in case of uni-directional
	//
	
	@OneToMany(mappedBy="instructor"
			, cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH}
			, fetch=FetchType.LAZY)
	private List<Course> courses;
	
	
	public void addCourse(Course cc) {
		if(courses==null)
			courses = new ArrayList<Course>();
		cc.setInstructor(this);
		courses.add(cc);
	}
	
	public void printAllCourses() {
		
		for(Course c:courses)
			System.out.println(c.toString());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetails getInstructorDetails() {
		return instructorDetails;
	}

	public void setInstructorDetails(InstructorDetails instructorDetails) {
		this.instructorDetails = instructorDetails;
	}
	
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
}
