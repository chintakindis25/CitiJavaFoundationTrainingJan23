package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter AccountNumber: ");
		int accountNumber=scanner.nextInt();
		System.out.print("Enter Name: ");
		String name=scanner.next();
		System.out.print("Enter Balance: ");
		double balance=scanner.nextInt();
		
//		System.out.println(accountNumber +  name + balance);
		//Commented for V6 changes

//		Account account = new Account();
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
//		System.out.println("Your account is opened successfully");
//		System.out.println("AccountNumber: "+account.getAccountNumber());
//		System.out.println("Name: "+account.getName());
//		System.out.println("Balance: "+account.getBalance());
		//Commented for V6 changes

		
	}

}
