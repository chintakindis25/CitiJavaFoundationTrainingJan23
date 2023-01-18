package com.citibank.main.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private Connection connection;
	private String driverName = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String userID = "root";
	private String password = "root";
	
	public Connection getConnection() {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userID, password);
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver Load Failed");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Database Connection Failed");
			e.printStackTrace();
		}
		return null;
	}	
}