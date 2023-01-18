package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AsyncAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(101,"Shravan",40000);
		
		AccountThread accountThread1 = new AccountThread(account, 1);
		Thread thread1 = new Thread(accountThread1);
		thread1.start();
		
		AccountThread accountThread2 = new AccountThread(account, 2);
		Thread thread2 = new Thread(accountThread2);
		thread2.start();	
		
	}

}
