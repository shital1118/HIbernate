package com.cdac.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  		  
		  Person person = new Person();
		  person.setpId(1);
		  person.setFirstName("mani");
		  person.setLastName("Langote");
		  
		  Customer customer = new Customer();
		  customer.setpId(2);
		  customer.setFirstName("mani");
		  customer.setLastName("Langote");
		  customer.setMobileNo("970891202");
		  
		  OnlineCustomer onlineCustomer= new OnlineCustomer();
		  onlineCustomer.setpId(3);
		  onlineCustomer.setFirstName("mani");
		  onlineCustomer.setLastName("Langote");
		  onlineCustomer.setMobileNo("970891202");
		  onlineCustomer.setEmail("sp@g.com");
		  
		  session.save(person);
		  session.save(customer);
		  session.save(onlineCustomer);
		  
		  session.getTransaction().commit();
		  session.close();
		  
	}

}
