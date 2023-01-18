package com.citibank.main.domain;

public class MyClass {
	final int max = 500;
	public int num1 = 10;
	public static int num2 = 10;
	
	static{
		System.out.println("Static Block of Myclass ");
	}
	
	{
		System.out.println("non-static Block of Myclass ");
	}
	
	public void display()
	{
		System.out.println("num1 - "+ num1);
		System.out.println("num2 - "+ num2);
		
		num1 = num1 + 10;
		num2 = num2 + 10;
		System.out.println("num1 - "+ num1);
		System.out.println("num2 - "+ num2);		
	}
}
