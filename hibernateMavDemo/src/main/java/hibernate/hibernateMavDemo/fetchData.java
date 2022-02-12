package hibernate.hibernateMavDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchData {
	public static void main(String[] args) {
		//get, load
		
		Configuration cfg =  new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		Employee employee=(Employee)session.get(Employee.class, 1);
		
		System.out.println(employee);
		
		session.close();
		factory.close();
		
		
	}
	

}
