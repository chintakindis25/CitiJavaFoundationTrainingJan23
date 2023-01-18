package com.citibank.main.domain;

public class Triangle extends Shapes {
	public Triangle() {
		// TODO Auto-generated constructor stub
		System.out.println("Triangle - Default constructor");
	}
	public Triangle(int size)
	{
		System.out.println("Triangle - Param. constructor");
		System.out.println("Size   - "+size);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Triangle");
	}
}
