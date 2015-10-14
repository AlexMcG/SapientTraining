package com.sapient.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		SessionFactory factory;
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		List socialAccounts = new ArrayList();

		try {
			tx = session.beginTransaction();

			socialAccounts.add(new Social("arafathfb"));
			socialAccounts.add(new Social("arafathg+"));
			socialAccounts.add(new Social("arafath_"));
			
			Contact contact = new Contact();
			
			contact.setFirstName("Arafath");
			contact.setLastName("Aboobacker");
			contact.setEmail("ArafathAboobacker@gmail.com");
			contact.setSocial(socialAccounts);
			
			long id = (Long) session.save(contact);
			System.out.println(id);
			tx.commit();
			
			List contacts = session.createQuery("FROM contact").list();
			for (Iterator iterator1 = contacts.iterator(); iterator1.hasNext();) {
				contact = (Contact) iterator1.next();
				System.out.println("First Name: " + contact.getFirstName());
				System.out.println("Last Name: " + contact.getLastName());
				
				socialAccounts = contact.getSocial();
				if (socialAccounts != null) {
					for (Iterator iterator2 = socialAccounts.iterator(); iterator2.hasNext();) {
						Social social = (Social) iterator2.next();
						System.out.println("Social ID"+ social.getSocialId());
					}
			}
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
