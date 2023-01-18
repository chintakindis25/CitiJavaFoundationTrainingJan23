package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle circle = new Circle(10);
//		circle.draw();
		
		System.out.println("Enter your choice : \n 1. Circle \t 2. Triangle \t 3. Line ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt(); 
		Shapes shapes = getShapes(choice);
		shapes.draw();  // Should call draw function of Circle
	}

		public static Shapes getShapes(int choice)
		{
			if (choice == 1)
			{
				return new Circle();
			}
			if (choice == 2)
			{
				return new Triangle();
			}
			if (choice == 3)
			{
				return new Line();
			}
			return null;
		}
}
