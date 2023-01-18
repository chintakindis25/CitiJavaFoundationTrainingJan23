package com.citibank.main.domain;

public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
//		System.out.println("Account - default constructor");
	}	
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
	
	public synchronized boolean withdraw(double amount) {
		System.out.println("withdraw() Called  - start");
		if (amount > 0 && balance >= amount )
		{
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			balance = balance - amount;
			System.out.println("Amount withdraw success..!");
			System.out.println("Balance after Withdraw 4000: " +getBalance());
			System.out.println("withdraw() Called  - end");
			return true;
		}
		return false;
	}
	
	public synchronized boolean deposit(double amount){
			System.out.println("deposit() Called - start");
			if (amount > 0)
			{
//				try {
//					Thread.sleep(000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				balance = balance + amount;
				System.out.println("Amount deposit success..!");
				System.out.println("Balance after Deposit 5000: " +getBalance());
				System.out.println("deposit() Called - end");
				return true;
			}
			return false;
	}
}