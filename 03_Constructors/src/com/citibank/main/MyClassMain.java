package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		MyClass myClass = new MyClass();
		myClass.show();
		System.out.println("---------------------------------------------");
		new MyClass();
		System.out.println("---------------------------------------------");
		new MyClass().show();
		System.out.println("---------------------------------------------");
		new MyClass(1).show();
		System.out.println("---------------------------------------------");
		new MyClass("Myclass").show();
		System.out.println("---------------------------------------------");
		new MyClass(1,2).show();
		System.out.println("Main end");
	}
}
