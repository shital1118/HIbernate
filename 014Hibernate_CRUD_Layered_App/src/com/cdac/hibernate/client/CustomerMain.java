package com.cdac.hibernate.client;

import java.util.List;

import com.cdac.hibernate.exception.customerException;
import com.cdac.hibernate.model.Customer;
import com.cdac.hibernate.service.CustomerService;
import com.cdac.hibernate.service.ICustomerService;

public class CustomerMain {

	private static ICustomerService customerService;
	 static {
		customerService = new CustomerService();
		
	}

	
		public static void main(String[] args) throws customerException {
				
			System.out.println("\n    Adding the customer record ");
			
			Customer customer=new Customer(111,"Shitu","sp@g.com","12345678");
			
			customerService.addCustomer(customer);
			
			System.out.println("\n    Retrieve the customer record  by id");
			
			System.out.println("Customer Found :"+customerService.getCustomer(customer.getCustId()));
			
			
			
			
			System.out.println("\n 		Update the customer record ");
			
			customer.setCustName("Shital Langote");
			System.out.println("Customer updated :"+customerService.updateCustomer(customer));
			
			
			
			System.out.println("\n 		Listing the customer record ");
			
			List<Customer> custList=customerService.listAllCustomer();
			custList.forEach((cust1)->System.out.println(cust1));
			
			
			System.out.println("\n 		Delete the customer record ");
			System.out.println("Customer deleted :"+customerService.deleteCustomer(customer.getCustId()));
			
		}
	
}
