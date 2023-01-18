package com.citibank.main;

import com.citibank.main.domain.Current;

public class BankingApplicationMainV5 {

	public static void main(String[] args) {
		Current current = new Current(101, "Vivek Gohil", 10000, 50000);
		
		System.out.println("------------------");
		if(current.withdraw(5000)) {
			System.out.println("Withdraw 5000");
			//5000
			System.out.println(" Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}
		System.out.println("------------------");
		if(current.withdraw(20000)) {
			System.out.println("Withdraw 20000");
			//0
			System.out.println("Balance :: " + current.getBalance());
			//35000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}
		System.out.println("------------------");
		if(current.deposit(10000)) {
			System.out.println("Deposit 10000");
			//0
			System.out.println("Balance :: " + current.getBalance());
			//45000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());	
		}
		System.out.println("------------------");
		if(current.deposit(15000)) {
			System.out.println("Deposit 15000");
			//10000
			System.out.println("Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
		System.out.println("------------------");
		if(current.deposit(5000)) {
			System.out.println("Deposit 5000");
			//15000
			System.out.println("Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
		System.out.println("------------------");
		if(current.withdraw(80000)) {
			System.out.println("Withdraw 80000");
			//15000
			System.out.println("Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
	}

}