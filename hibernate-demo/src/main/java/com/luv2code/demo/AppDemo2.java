package com.luv2code.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Course;
import com.luv2code.entity.Employee;
import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetails;
import com.luv2code.entity.Student;

public class AppDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Instructor inst = new Instructor();
			inst.setFirstName("ahemd");
			inst.setLastName("mog");
			inst.setEmail("Email@efa.fo");
			
			Course c1 = new Course("Intro to CS");
			Course c2 = new Course("Math I");
			Course c3 = new Course("Math III");
			
			inst.addCourse(c1);
			inst.addCourse(c2);
			inst.addCourse(c3);
			
			session.persist(inst);
			
			session.getTransaction().commit();
			
			session.close();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//Instructor instructor = session.get(Instructor.class, 1);
			//instructor.getCourses();
			//instructor.printAllCourses();
			//System.out.println("\n" + instructor.getCourses().get(0).getInstructor().toString());
			
			
			
			//System.out.println(inD2.get(0).getInstructor().toString());
			//inD2.get(0).getInstructor().setInstructorDetails(null);
			//session.delete(inD2.get(0));
			
			session.getTransaction().commit();
			
		}catch(Exception e) {
			System.out.println(e);
			session.close();
			factory.close();
		}
		
	}

}