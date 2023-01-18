package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class JDBCConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb","root","root");
			System.out.println("2. DB2 connection Successful");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Database connection failed");
		}
		System.out.println("Main end");
	}

}