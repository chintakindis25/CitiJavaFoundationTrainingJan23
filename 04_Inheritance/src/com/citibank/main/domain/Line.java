package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		// TODO Auto-generated constructor stub
		System.out.println("Line - Default constructor");
	}
	public Line(int size)
	{
		System.out.println("Line - Param. constructor");
		System.out.println("Size   - "+size);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Line");

	}
}
