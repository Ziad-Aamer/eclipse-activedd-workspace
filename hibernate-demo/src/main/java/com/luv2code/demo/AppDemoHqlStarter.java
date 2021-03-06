package com.luv2code.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Student;

public class AppDemoHqlStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Student s = new Student("Khaled", "isma", "dhiawhdi2@gma.dop"); 
			System.out.println(s);
			session.save(s);
			s.setEmail("shiter@ferk");
			session.save(new Student("ahmed", "isma", "dhiawhdi2@gma.dcas"));
			session.save(new Student("moha", "isma", "fasc@gma.dcas"));
			session.save(new Student("sop", "issa", "dhiawhdi2@gma.dcas"));
			session.save(new Student("derp", "isma", "22@gma.dowp"));
			System.out.println(s);

			System.out.println("Students are saved");
			
			session.getTransaction().commit();
			
			//apply the HQL Queries
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("delete from Student where email like '%dcas%'")
					.executeUpdate();
			
			List<Student> students = session
					.createQuery("from Student s where s.lastName='issa'"
						+ "or s.firstName='derp' or s.email like '%dop'").getResultList();
			//session.createQuery("update Student set email='luv2code@BOM'").executeUpdate();
			
			for(Student ss: students)
				System.out.println(ss);
			
			session.getTransaction().commit();
			session.close();
			
		}finally {
			factory.close();
		}
	}

}
