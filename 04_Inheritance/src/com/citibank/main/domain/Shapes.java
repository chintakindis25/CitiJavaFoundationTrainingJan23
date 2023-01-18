package com.citibank.main.domain;

//Base class, Generalization
public abstract class Shapes extends Object{
	public Shapes() {
		// TODO Auto-generated constructor stub
		System.out.println("Shapes - Default constructor");
	}
	public Shapes(int size)
	{
		System.out.println("Shapes - Param. constructor");
		System.out.println("Size   - "+size);
	}
	public abstract void draw();
	
	public void convertShapes()
	{
		System.out.println("Converting Shapes");
	}
}

