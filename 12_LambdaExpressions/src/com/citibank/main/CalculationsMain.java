package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalculationsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------Addition-------------------");
		//Addition - Anonymous Class
		CalculationsInterface add1 = new CalculationsInterface() {
			
			@Override
			public double doCalculations(double num1, double num2) {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class - "+num1+" + "+num2+" = "+(num1+num2));
				return 0;
			}
		};
		add1.doCalculations(5, 6);
		
		//Addition - Lambda Expression
		CalculationsInterface add2 = (double num1,double num2) -> {
			System.out.println("Lambda Expression - "+num1+" + "+num2+" = "+(num1+num2));
			return 0;
		};
		add2.doCalculations(5, 6);
		
		System.out.println("------------Substraction-------------------");
		//Substraction - Anonymous Class
		CalculationsInterface sub1 = new CalculationsInterface() {
			
			@Override
			public double doCalculations(double num1, double num2) {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class - "+num1+" - "+num2+" = "+(num1-num2));
				return 0;
			}
		};
		sub1.doCalculations(5, 6);
		
		//Substraction - Lambda Expression
		CalculationsInterface sub2 = (double num1,double num2) -> {
			System.out.println("Lambda Expression - "+num1+" - "+num2+" = "+(num1-num2));
			return 0;
		};
		sub2.doCalculations(5, 6);
		
		System.out.println("------------Multiplication-------------------");
		//Multiplication - Anonymous Class
		CalculationsInterface mul1 = new CalculationsInterface() {
			
			@Override
			public double doCalculations(double num1, double num2) {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class - "+num1+" * "+num2+" = "+(num1*num2));
				return 0;
			}
		};
		mul1.doCalculations(5, 6);
		
		//Multiplication - Lambda Expression
		CalculationsInterface mul2 = (double num1,double num2) -> {
			System.out.println("Lambda Expression - "+num1+" * "+num2+" = "+(num1*num2));
			return 0;
		};
		mul2.doCalculations(5, 6);
		
		System.out.println("------------Division-------------------");
		//Division - Anonymous Class
		CalculationsInterface div1 = new CalculationsInterface() {
			
			@Override
			public double doCalculations(double num1, double num2) {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class - "+num1+" / "+num2+" = "+(num1/num2));
				return 0;
			}
		};
		div1.doCalculations(5, 6);
		
		//Division - Lambda Expression
		CalculationsInterface div2 = (double num1,double num2) -> {
			System.out.println("Lambda Expression - "+num1+" / "+num2+" = "+(num1/num2));
			return 0;
		};
		div2.doCalculations(5, 6);
		
	}

}
