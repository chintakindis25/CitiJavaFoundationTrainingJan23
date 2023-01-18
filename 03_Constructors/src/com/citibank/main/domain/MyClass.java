package com.citibank.main.domain;

public class MyClass {
	public MyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("MyClass - Default Constructor ");
	}
	public MyClass(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("MyClass - Parameterized Constructor with int param.. ");
	}
	public MyClass(int i,int j) {
		// TODO Auto-generated constructor stub
		System.out.println("MyClass - Parameterized Constructor with two int param.. ");
	}
	
	public MyClass(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("MyClass - Parameterized Constructor with String param.. ");
	}
	public void show() {
		System.out.println("Hi");
	}
}
