package com.sapient.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sapient.hibernate.Contact;


public class MainApp {
	public static void main(String[] args) {
		SessionFactory factory;
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			
			Contact contact = new Contact();
			contact.setId(2);
			contact.setFirstName("Alex");
			contact.setLastName("Gibbs");
			contact.setEmail("Alexander@gmail.com");
			
			session.saveOrUpdate(contact);
			
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
