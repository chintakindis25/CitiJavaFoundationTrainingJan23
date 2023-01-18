package com.citibank.main.service;

import java.util.List;
import com.citibank.main.domain.Customer;

public interface CustomerServiceInterface  {

	boolean addNewCustomer(Customer customer);
	Customer getCustomerByCustomerID(int customerID);
	List<Customer> getAllCustomers();
	boolean updateCustomerByCustomerID(Customer customer);
	boolean deleteCustomerByCustomerID(int customerID);	
}
