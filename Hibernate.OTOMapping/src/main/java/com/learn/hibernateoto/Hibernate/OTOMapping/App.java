package com.learn.hibernateoto.Hibernate.OTOMapping;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		Bike bk1 = new Bike(1234, "Hero", 125000);
		Bike bk2 = new Bike(2233, "Honda", 225000);
		Bike bk3 = new Bike(3344, "KTM", 500000);


		Person p1 = new Person(11, "Ajay", 25,bk1);
		Person p2 = new Person(12, "Mohan", 26,bk2);
		Person p3 = new Person(13, "Ayush", 27,bk3);

		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(bk1);
		session.save(bk2);
		session.save(bk3);

		tr.commit();
		System.out.println("Objects are Saved");
	}
}
