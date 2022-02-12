package hibernateDemo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Mainapp {
    public static void main(String[] args) {
       /// Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Person person=new Person();
        person.setName("sarthak");
        person.setAddress("pune");
        session.save(person);
        transaction.commit();
        session.close();           
        sessionFactory.close();  
    }
}