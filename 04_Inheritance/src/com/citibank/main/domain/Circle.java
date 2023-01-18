package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		// TODO Auto-generated constructor stub
		System.out.println("Circle - Default constructor");
	}
	public Circle(int size)
	{
		super(size);
		System.out.println("Circle - Param. constructor");
		System.out.println("Size   - "+size);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}
}
class object
{
public object() {
	// TODO Auto-generated constructor stub
	System.out.println("Object - default constructor");
}	
}
