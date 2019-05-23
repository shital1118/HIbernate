package com.cdac.hibernate.dao;

import java.util.List;

import org.hibernate.Transaction;

import com.cdac.hibernate.exception.customerException;
import com.cdac.hibernate.model.Customer;

public interface ICustomerDao {

	public Customer addCustomer(Customer customer)throws customerException;
	public Customer getCustomerBId(Integer custId)throws customerException;
	public Customer updateCustomer(Customer customer)throws customerException;
	public Customer deleteCustomer(Integer custId)throws customerException;
	public List<Customer> listAllCustomer()throws customerException;
	
	public Transaction beginTx() throws customerException;
	public void commitTx() throws customerException;
}
