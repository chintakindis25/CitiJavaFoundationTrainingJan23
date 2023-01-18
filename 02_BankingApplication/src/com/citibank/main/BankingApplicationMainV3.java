package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		Account account;
		int accountNumber;
		String name;
		double balance;
		double amount;
		char option;
		String continueChoice="yes";
		
		System.out.print("Enter AccountNumber: ");
		accountNumber=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Name: ");
		name=scanner.nextLine();
		System.out.print("Enter Balance: ");
		balance=scanner.nextInt();
		
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		//Commented for V6 changes
//
//		account = new Account();
//		account = new Account(accountNumber,name,balance);
		
//		System.out.println("Your account is opened successfully");
//		System.out.println("AccountNumber: "+account.getAccountNumber());
//		System.out.println("Name: "+account.getName());
//		System.out.println("Balance: "+account.getBalance());
//		
//		do
//		{
//			continueChoice = menuMethods(scanner, account);
//		} while(continueChoice.equalsIgnoreCase("yes"));	
		//Commented for V6 changes
		
		System.out.println("Thankyou for banking with Us.  Have a nice day!!! ");
		
////		System.out.println(accountNumber +  name + balance);
//
//		System.out.println("Your account is opened successfully");
//		System.out.println("AccountNumber: "+account.getAccountNumber());
//		System.out.println("Name: "+account.getName());
//		System.out.println("Balance: "+account.getBalance());
		
	}

	private static String menuMethods(Scanner scanner, Account account) {
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
				System.out.println("Your account balance is "+account.getBalance());
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
