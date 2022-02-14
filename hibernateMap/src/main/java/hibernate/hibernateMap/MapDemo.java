package hibernate.hibernateMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//create Question
		 Question q1= new Question();
		 q1.setQuestnTd(1);
		 q1.setQuestion("what is java");
		 
		 
		 //create Answer
		 Answer answer= new Answer();
		 answer.setAnswerId(11);
		 answer.setAnswer("java is programming langauge");
		 answer.setQuestion(q1);
		 
		 q1.setAnswer(answer);
		 
		 
		 Question q2= new Question();
		 q2.setQuestnTd(2);
		 q2.setQuestion("what is collection");
		 
		 
		 //create Answer
		 Answer answer1= new Answer();
		 answer1.setAnswerId(22);
		 answer1.setAnswer("collection is framework");
		 answer1.setQuestion(q2);
		 
		 q2.setAnswer(answer1);
		 
		 Session s= factory.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 
		 
		 s.save(q1);
		 s.save(q2);
		 s.save(answer);
		 s.save(answer1);
		 tx.commit();
		 s.close();
		 factory.close();
		 
		 
		 
		 
	}
}
