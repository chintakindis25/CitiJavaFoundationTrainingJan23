package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Savings;
//Savings Account Logic..
public class BankingApplicationMainV4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		Savings savings;
		
		int SavingsNumber;
		String name;
		double balance;
		double amount;
		char option;
		boolean isSalary;
		String continueChoice="yes";
		
		System.out.print("Enter Account Number: ");
		SavingsNumber=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Name: ");
		name=scanner.nextLine();
		System.out.print("Enter Balance: ");
		balance=scanner.nextInt();
		System.out.print("Do you want to open Salary account(Yes/No)?  ");
		if((scanner.next().equalsIgnoreCase("Yes")||(scanner.next()).equalsIgnoreCase("Y")))
		{
			isSalary=true;
		}
		else
		{
			isSalary=false;
		}
				
		savings = new Savings(SavingsNumber,name,balance,isSalary);
		
		System.out.println("Your Account is opened successfully");
		System.out.println("SavingsNumber: "+ savings.getAccountNumber());
		System.out.println("Name: "+ savings.getName());
		System.out.println("Balance: "+ savings.getBalance());
		System.out.println("Salary account (true/false): " + savings.isSalary());
		
		do
		{
			continueChoice = menuMethods(scanner, savings);
		} while(continueChoice.equalsIgnoreCase("yes"));	
		
		System.out.println("Thankyou for banking with Us.  Have a nice day!!! ");
}

	private static String menuMethods(Scanner scanner, Savings savings) {
		double amount;
		char option;
		String continueChoice;
		System.out.println("Transaction Menu");
		System.out.println("Press 1 for Withdraw");
		System.out.println("Press 2 for Deposit");
		System.out.println("Press 3 for Check Balance");
		System.out.println("Press 4 for Exit");
		System.out.print("enter your option: ");
		option = scanner.next().charAt(0);
		switch(option)
		{
			case '1': 
				System.out.print("Enter amount to Withdraw ");
				amount = scanner.nextDouble();
				if(savings.withdraw(amount)) 
					System.out.println("Withdraw successful !");
				else
					System.out.println("Withdraw Failed !");
				break;
				
			case '2': 
				System.out.print("Enter amount to Deposit ");
				amount = scanner.nextDouble();
				if(savings.deposit(amount)) 
					System.out.println("Deposit successful !");
				else
					System.out.println("Deposit failed !");
				break;
				
			case '3': 
				System.out.println("Your Savings balance is "+savings.getBalance());
				break;
			case '4':
				System.out.println("Thankyou for banking with Us.  Have a nice day!!! ");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid option");
		}
		
		System.out.println("Do you want to continue(yes/no)?");
		continueChoice=scanner.next();
		return continueChoice;
	}

}
