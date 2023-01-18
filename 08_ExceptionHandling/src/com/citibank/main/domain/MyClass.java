package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {

	private double num1,num2,result;
	
	public void accept()
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter two numbers to divide");
			System.out.println("Enter num1: ");
			num1 = scanner.nextDouble();
			System.out.println("Enter num2: ");
			num2 = scanner.nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
			System.out.println("Program will continue...");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception in code");
			System.out.println("Program will continue...");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Thankyou");
		}
	}
	public void calculate()
	{
		System.out.println("Calculating Result ");
		result = num1 / num2;
	}
	public void display()
	{
		System.out.println(num1 +" / "+ num2 +" = "+ result);
	}
}
