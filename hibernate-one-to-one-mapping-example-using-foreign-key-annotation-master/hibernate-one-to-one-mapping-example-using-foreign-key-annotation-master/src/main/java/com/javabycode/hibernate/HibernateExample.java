package com.javabycode.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.javabycode.hibernate.model.Address;
import com.javabycode.hibernate.model.Student;

public class HibernateExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Student student = new Student("David Pham", new Date(), "USA", "1234569");
		Address address = new Address("LaSalle Street", "Chicago", "USA");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.persist(address);
		student.setAddress(address);
		session.persist(student);
		session.getTransaction().commit();
		session.flush();

		List<Student> students = (List<Student>) session.createQuery("from Student ").list();
		for (Student s : students) {
			System.out.println("Student : " + s);
		}

		List<Address> addressList = (List<Address>) session.createQuery("from Address ").list();
		for (Address add : addressList) {
			System.out.println("Address : " + add);
		}

		session.close();
		System.exit(0);
	}

}
