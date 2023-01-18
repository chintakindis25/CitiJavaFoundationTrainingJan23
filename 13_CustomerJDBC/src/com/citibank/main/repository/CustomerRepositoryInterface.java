package com.citibank.main.repository;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerRepositoryInterface {
	boolean addNewCustomer(Customer customer);
	Customer getCustomerByCustomerID(int customerID);
	List<Customer> getAllCustomers();
	boolean updateCustomerByCustomerID(Customer customer);
	boolean deleteCustomerByCustomerID(int customerID);
}
