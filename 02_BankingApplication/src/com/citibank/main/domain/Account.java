package com.citibank.main.domain;

public abstract class Account {
	
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
//		System.out.println("Account - default constructor");
	}	
//	public Account(int accountNumber,String name,double balance)
//	{
//		setAccountNumber(accountNumber);
//		setName(name);
//		setBalance(balance);
//	
//	}
	public Account(int accountNumber, String name, double balance) {
//		System.out.println("Account - param constructor");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract boolean withdraw(double amount);
	public abstract boolean deposit(double amount);


//	public boolean withdraw(double amount) {
//		System.out.println("withdraw() Called ");
//		if (amount > 0 && balance >= amount )
//		{
//			balance = balance - amount;
//			System.out.println("Amount withdraw success..!");
//			return true;
//		}
//		return false;
//	}
//	
	
//	public boolean deposit(double amount){
//			System.out.println("deposit() Called");
//			if (amount > 0)
//			{
//				balance = balance + amount;
//				System.out.println("Amount deposit success..!");
//				return true;
//			}
//			return false;
//	}
}