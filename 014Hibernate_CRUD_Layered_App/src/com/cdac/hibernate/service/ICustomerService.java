package com.cdac.hibernate.service;

import java.util.List;

import com.cdac.hibernate.exception.customerException;
import com.cdac.hibernate.model.Customer;

public interface ICustomerService {


	public Customer addCustomer(Customer customer)throws customerException;
	public Customer getCustomer(Integer custId)throws customerException;
	public Customer updateCustomer(Customer customer)throws customerException;
	public Customer deleteCustomer(Integer custId)throws customerException;
	public List<Customer> listAllCustomer()throws customerException;
}
