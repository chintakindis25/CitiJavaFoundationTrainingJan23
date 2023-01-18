package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBCInsertQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb","root","root");
			System.out.println("2. DB2 connection Successful");
			
			String sqlQuery = "insert into customer_details(name,city) values (?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			Scanner scanner = new Scanner(System.in);
			int rowCount = 0;
			for (int i=1;i<=5;i++)
			{
				System.out.println("Enter Name and city for employee "+(rowCount+1));
				preparedStatement.setString(1,scanner.next());
				preparedStatement.setString(2,scanner.next());
				rowCount = rowCount + preparedStatement.executeUpdate();
			}	
			if(rowCount > 0)
				System.out.println("Insert Successful "+rowCount+" rows inserted");
			else
				System.out.println("No rows inserted!");
						
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Database connection failed");
		}	
		finally {
			try {
				connection.close();
				System.out.println("database connection close Successful");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("database connection close failed");
				e.printStackTrace();
			}
		}
		System.out.println("Main end");
	}
}