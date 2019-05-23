package com.cdac.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdac.hibernate.exception.customerException;
import com.cdac.hibernate.model.Customer;

public class CustomerDao implements ICustomerDao {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query query;
	
	
	public CustomerDao() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		session =sessionFactory.openSession();
		
	}

	@Override
	public Customer addCustomer(Customer customer) throws customerException {
			
			//DML -so begin  transaction before save method and  after  commit tx
		session.save(customer);
			
		return customer ;
	}

	@Override
	public Customer getCustomerBId(Integer custId) throws customerException {
	
			
		return (Customer) session.get(Customer.class,custId);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws customerException {
		
		session.update(customer);
		return customer;
	}
	

	@Override
	public Customer deleteCustomer(Integer custId) throws customerException {
		
			Customer customer=getCustomerBId(custId);
			if(customer!=null)
			{
				session.delete(customer);
			}
			
			else 
					customer=null;
				
			
		return customer;
	}

	@Override
	public List<Customer> listAllCustomer() throws customerException {
		// TODO Auto-generated method stub
		return session.createQuery("From Customer").list();
	}

	@Override
	public Transaction beginTx() throws customerException {
		
			transaction=session.beginTransaction();
		
		return transaction;
	}

	@Override
	public void commitTx() throws customerException {
		
		transaction.commit();
	}

}
