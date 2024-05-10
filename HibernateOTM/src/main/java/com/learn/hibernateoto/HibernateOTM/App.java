package com.learn.hibernateoto.HibernateOTM;

import java.util.*;

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

		Technology t1 = new Technology();
		Technology t2 = new Technology();
		Technology t3 = new Technology();
		Technology t4 = new Technology();

		

		SoftwareEng se1 = new SoftwareEng();
		SoftwareEng se2 = new SoftwareEng();
		SoftwareEng se3 = new SoftwareEng();
		
		t1.setT_Id(123);
		t1.setT_name("Java");
		
		t2.setT_Id(124);
		t2.setT_name("HTML");
		
		t3.setT_Id(125);
		t3.setT_name("Css");
		
		t4.setT_Id(126);
		t4.setT_name("SQL");
		
		
		List<Technology> list1 = new ArrayList<Technology>();
		list1.add(t1);
		list1.add(t2);
		List<Technology> list2 = new ArrayList<Technology>();
		list2.add(t1);
		list2.add(t2);
		list2.add(t3);
		list2.add(t4);
		List<Technology> list3 = new ArrayList<Technology>();
		list3.add(t1);
		list3.add(t4);
		
		se1.setId(1);
		se1.setName("Sumit");
		se1.setAge(22);
		se1.setTech(list1);
		
		se2.setId(2);
		se2.setName("Rohan");
		se2.setAge(24);
		se2.setTech(list2);
		
		se3.setId(3);
		se3.setName("Sourav");
		se3.setAge(32);
		se3.setTech(list3);
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		session.save(se1);
		session.save(se2);
		session.save(se3);

		tr.commit();
		System.out.println("Objects are Saved");
	}
}
