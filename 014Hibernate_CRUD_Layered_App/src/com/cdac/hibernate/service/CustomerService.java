package com.cdac.hibernate.service;

import java.util.List;

import com.cdac.hibernate.dao.CustomerDao;
import com.cdac.hibernate.dao.ICustomerDao;
import com.cdac.hibernate.exception.customerException;
import com.cdac.hibernate.model.Customer;

public class CustomerService implements ICustomerService {
	
	private ICustomerDao customerDao;
	
	
	public CustomerService() {
		
		customerDao =new CustomerDao();
	}

	@Override
	public Customer addCustomer(Customer customer) throws customerException {
		
		customerDao.beginTx();
		Customer addedCustomer = customerDao.addCustomer(customer);
		customerDao.commitTx();
		return addedCustomer;
	}

	@Override
	public Customer getCustomer(Integer custId) throws customerException {
		
		return customerDao.getCustomerBId(custId);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws customerException {
		
		customerDao.beginTx();
		Customer updateCustomer = customerDao.updateCustomer(customer);
		customerDao.commitTx();
		return updateCustomer;
	}

	@Override
	public Customer deleteCustomer(Integer custId) throws customerException {
		customerDao.beginTx();
		Customer deleteCustomer = customerDao.deleteCustomer(custId);
		customerDao.commitTx();
		return deleteCustomer;
	}

	@Override
	public List<Customer> listAllCustomer() throws customerException {
		// TODO Auto-generated method stub
		return customerDao.listAllCustomer();
	}

}
