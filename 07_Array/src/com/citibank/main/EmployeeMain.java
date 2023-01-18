package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee(1,"Shweta",50000);
		Employee employee2 = new Employee(2,"Priya",45000);
		Employee employee3 = new Employee(3,"Rajani",54000);
		Employee employee4 = new Employee(4,"Pravin",50000);
		Employee employee5 = new Employee(5,"Abhishek",50000);
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println(employee4.toString());
		System.out.println(employee5);
		
		Scanner scanner = new Scanner(System.in);
		Employee employeeList[] = new Employee[5];
		int ID;
		String name;
		double salary;
		
		for (int i = 0; i < employeeList.length; i++) {
			System.out.println("Enter details for Employee :" +(i+1));
			System.out.println("Enter ID:");
			ID = scanner.nextInt();
			System.out.println("Enter Name:");
			name = scanner.next();
			System.out.println("Enter Salary:");
			salary = scanner.nextDouble();

			employeeList[i] = new Employee(ID, name, salary);
		
		}
		
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
	}

}
