package hibernate.hibernateMavDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration cfg =  new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Employee em= new Employee();
		em.setId(1);
		em.setFirstname("sarthak");
		em.setLastname("kondekar");
		
		department dept1= new department();
		dept1.setDeptName("prod");
		dept1.setLocation("pune");
		
		em.setDept(dept1);
		
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(em);
		tx.commit();
		session.close();
	}

}
