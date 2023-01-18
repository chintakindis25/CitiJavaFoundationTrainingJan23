package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {
	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myclass = new MyClass();
		myclass.show();
		
		System.out.println("-----------------");
		MyInterface myInterface = new MyClass();
		myInterface.show();
		System.out.println("-----------------");
		System.out.println(MyClass.message);
		System.out.println(MyInterface.message);
		System.out.println("-----------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Menu \n 1. MyClss Object \t 2. YourClass Object \n Enter your choice: " );
		int choice = scanner.nextInt();
		
		MyInterface myInterface1 = MyFactory.getObject(choice);
		
		if (myInterface1 != null)
			myInterface1.show();
		else 
			System.out.println("Invalid choice");
		System.out.println("Main end");
		
	}
}
