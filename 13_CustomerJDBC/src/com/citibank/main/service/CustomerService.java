package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerServiceInterface {

	private CustomerRepositoryInterface customerRepository = new CustomerRepository();
	@Override
	public boolean addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByCustomerID(customerID);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.getAllCustomers();
	}

	@Override
	public boolean updateCustomerByCustomerID(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.updateCustomerByCustomerID(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		return customerRepository.deleteCustomerByCustomerID(customerID);
	}
}
