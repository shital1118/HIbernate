package com.cdac.customer.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdac.hibernate.model.Customer;

public class UserApplication {
	
	public static void main(String[] args) {
		
		Customer customer=new Customer(901,"Shital","Langote","abc@g.com","7109309");
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		
		Session session=null;
		Transaction transaction=null;
		try {
		session=factory.openSession();
		transaction =session.beginTransaction();
		int id=(int) session.save(customer);
		System.out.println("inserted Customers :"+id);
		
		transaction.commit();
		
	}
		catch(Exception ex){
	ex.printStackTrace();
	
	if(transaction!=null)
		
		transaction.rollback();
		
}
	}
}
