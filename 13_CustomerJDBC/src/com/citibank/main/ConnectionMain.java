package com.citibank.main;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;
import com.citibank.main.service.CustomerService;

public class ConnectionMain {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		List<Customer> customers = new ArrayList<>();
		
		System.out.println("-----------------addNewCustomer-----------------");
		Customer customer= new Customer(0, "Shridhar", "Kerala");
		customerService.addNewCustomer(customer);
//		System.out.println("-----------------getAllCustomers-----------------");
//		customers = customerService.getAllCustomers();
//		for (Customer c: customers)
//		{
//			System.out.println(c);
//		}
		
		System.out.println("-----------------updateCustomerByCustomerID-----------------");
		customer= new Customer(31, "Shridhar", "Kochi");
		customerService.updateCustomerByCustomerID(customer);
		
		System.out.println("-----------------getCustomerByID-----------------");
		Customer c= customerService.getCustomerByCustomerID(32);
		if (c==null)
			System.out.println("No customer found for given ID");
		else
			System.out.println(c);
		
		System.out.println("-----------------deleteCustomerByCustomerID-----------------");
		customerService.deleteCustomerByCustomerID(32);
		
		System.out.println("-----------------getAllCustomers-----------------");
		List<Customer> customers2 = customerService.getAllCustomers();
		for (Customer c1: customers2)
		{
			System.out.println(c1);
		}
	}
}