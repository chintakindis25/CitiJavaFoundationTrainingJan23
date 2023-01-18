package com.citibank.main.domain;

public class AccountThread implements Runnable{

	private int choice;
	Account account;
	
	
	public AccountThread(Account account,int choice)
	{
		this.account = account;
		this.choice = choice;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println("Initial Balance : " +account.getBalance());
		if (choice == 1)
		{
			account.withdraw(4000);
			
			
		}else
		{
			if(choice == 2)
			{
				account.deposit(5000);
		
			}
		}
				
	}

}
