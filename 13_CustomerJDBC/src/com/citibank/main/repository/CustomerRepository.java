package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	private int rowCount;
	
	@Override
	public boolean addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Connection connection = (new ConnectionFactory()).getConnection();
		try {
			sql = "insert into customer_details(name,city) values (?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in);
			preparedStatement.setString(1,customer.getName());
			preparedStatement.setString(2,customer.getCity());
			rowCount = preparedStatement.executeUpdate();
				
			if(rowCount > 0)
				System.out.println("Insert Successful "+rowCount+" rows inserted");
			else
				System.out.println("No rows inserted!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerID(int custID) {
		// TODO Auto-generated method stub
		try {
				Connection connection = (new ConnectionFactory()).getConnection();
				sql = "select * from customer_details where customer_id=?";

				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, custID);
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					int customerID = resultSet.getInt("customer_id");
					String name = resultSet.getString("name");
					String city = resultSet.getString("city");
					Customer customer = new Customer(customerID, name, city);
					return customer;
				}
				else
					System.out.println("No rows found");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("SQL query error");
				e.printStackTrace();
			}
		
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		try {
			Connection connection = (new ConnectionFactory()).getConnection();
			sql = "select * from customer_details";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				int customerID = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String city = resultSet.getString("city");
				Customer customer = new Customer(customerID,name,city);
				customerList.add(customer);
			}
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL query error");
			e.printStackTrace();
		}
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerID(Customer customer) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = (new ConnectionFactory()).getConnection();
			sql = "update customer_details set name=?, city=? where customer_id=?";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getCity());
			preparedStatement.setInt(3, customer.getCutomerID());
						
			rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0)
				System.out.println("Update Successful "+rowCount+" rows affected");
			else
				System.out.println("No rows updated!");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		try {
			Connection connection = (new ConnectionFactory()).getConnection();
			sql = "delete from customer_details where customer_id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerID);
			rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0)
				System.out.println("Delete Successful "+rowCount+" rows deleted");
			else
				System.out.println("No rows deleted!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Customer c:customerList)
		{
			if(c.getCutomerID() == customerID)
			{
				customerList.remove(c);
				return true;
			}
		}
		return false;
	}
}
