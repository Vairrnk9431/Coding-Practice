package com.learn.hibernateProject1.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.cfgxml.spi.CfgXmlAccessService;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Student st = new Student(11, "Vaibhav", 78);
		session.save(st);
		tr.commit();
		System.out.println("Student object created and Saved");
	}
}
