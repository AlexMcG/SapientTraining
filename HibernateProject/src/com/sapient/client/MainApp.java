package com.sapient.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

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
			
			//HQL Query
			String SQL_Query = "select contact.id, contact.firstName from Contact contact";
			Query query = session.createQuery(SQL_Query);
			for(Iterator it = query.iterate(); it.hasNext();) {
				Object[] row = (Object[]) it.next();
				System.out.println("id: " + row[0]);
				System.out.println("First Name: " + row[1]);
			}
			
			
			//Criteria Query Example
//			Criteria criteria = session.createCriteria(Contact.class);
//			criteria.add(Restrictions.like("firstName", "%a%")); //Like condition
//			criteria.setMaxResults(8); //Restricts the max rows to 5
//			
//			List contacts = criteria.list();
//			for(Iterator iterator = contacts.iterator(); iterator.hasNext();) {
//				Contact contact = (Contact) iterator.next();
//				System.out.println("ID: " + contact.getId());
//				System.out.println("Name: " + contact.getEmail());
//			}
			
			//Regular Query
//			Contact contact = new Contact();
//			contact.setId(2);
//			contact.setFirstName("Alex");
//			contact.setLastName("Gibbs");
//			contact.setEmail("Alexander@gmail.com");
			
//			session.saveOrUpdate(contact);
//			session.flush();
//			tx.commit();
		} catch (HibernateException e) {
//			if (tx!=null) {
//				tx.rollback();
//			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
