package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Current;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		//declaring acct reference
		Account account = null;
		int accountNumber,acctChoice;;
		String name;
		double balance;
		double amount,overdraftLimit;
		char option;
		boolean isSalary;
		String continueChoice="yes";
		
		System.out.println("Accounts Menu \n 1. Savings \t 2. Current");
		acctChoice = scanner.nextInt();
		
		//reading acct details
		System.out.print("Enter Account Number: ");
		accountNumber=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Name: ");
		name=scanner.nextLine();
		System.out.print("Enter Balance: ");
		balance=scanner.nextInt();
		
		if (acctChoice == 1)
		{	System.out.print("Do you want to open Salary account(Yes/No)?  ");
			if((scanner.next().equalsIgnoreCase("Yes")||(scanner.next()).equalsIgnoreCase("Y")))
				isSalary=true;
			else
				isSalary=false;
			// Savings acct object creation 
			account = new Savings(accountNumber,name,balance,isSalary);
			System.out.println("Your Savings Account is opened successfully");
			System.out.println("SavingsNumber: "+ account.getAccountNumber());
			System.out.println("Name: "+ account.getName());
			System.out.println("Balance: "+ account.getBalance());
			System.out.println("Salary account (true/false): " + ((Savings) account).isSalary());
		}
		else if (acctChoice == 2)
		{	System.out.print("Enter OverdraftLimit:  ");
			overdraftLimit = scanner.nextDouble();
			//Current acct object creation
			account = new Current(accountNumber,name,balance,overdraftLimit);
			System.out.println("Your Current Account is opened successfully");
			System.out.println("SavingsNumber: "+ account.getAccountNumber());
			System.out.println("Name: "+ account.getName());
			System.out.println("Balance: "+ account.getBalance());
			System.out.println("Overdraft Limit: " + ((Current) account).getOverdraftLimit());
		}
		
		do
		{
			continueChoice = menuMethods(scanner, account);
				
		} while(continueChoice.equalsIgnoreCase("yes"));	
		
		System.out.println("Thankyou for banking with Us.  Have a nice day!!! ");

	}
	private static String menuMethods(Scanner scanner, Account account) {
			double amount;
			char option;
			String continueChoice;
			System.out.println("Transaction Menu");
			System.out.println("1. Withdraw \t2. for Deposit \t3. Check Balance \t4. Exit");
			System.out.print("enter your option: ");
			option = scanner.next().charAt(0);
			switch(option)
			{
				case '1': 
					System.out.print("Enter amount to Withdraw ");
					amount = scanner.nextDouble();
					if(account.withdraw(amount)) 
						System.out.println("Withdraw successful !");
					else
						System.out.println("Withdraw Failed !");
					break;
				case '2': 
					System.out.print("Enter amount to Deposit ");
					amount = scanner.nextDouble();
					if(account.deposit(amount)) 
						System.out.println("Deposit successful !");
					else
						System.out.println("Deposit failed !");
					break;				
				case '3': 
					System.out.println("Your Savings balance is "+account.getBalance());
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
