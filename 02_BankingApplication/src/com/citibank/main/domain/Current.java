package com.citibank.main.domain;

public class Current extends Account {
	private double overdraftLimit;
	private double initialOverdraftLimit;
	
	public Current() {
		// TODO Auto-generated constructor stub
		
	}

	public Current(int accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
		this.overdraftLimit = overdraftLimit;
		this.initialOverdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		
		if(amount > 0)
		{
			if (overdraftLimit < initialOverdraftLimit)
			{
				if (overdraftLimit+ amount <= initialOverdraftLimit)
					overdraftLimit = overdraftLimit+ amount;
				else
				{
					double tempOL = initialOverdraftLimit - overdraftLimit;
					overdraftLimit = overdraftLimit+tempOL;
					setBalance(amount - tempOL);
				}
			}else
				{
					setBalance(getBalance() +amount);
				}
			return true;
		}
		return false;
	}
	

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0)
		{
			if(getBalance() >= amount)
			{
				setBalance(getBalance() - amount);
			}
			else 
				{   if(getBalance() < amount && getBalance() + overdraftLimit >= amount)
					{
						double tempBalance = amount - getBalance();
						setBalance(0);
						overdraftLimit =overdraftLimit - tempBalance;
					}
				else{
					    return false;
				    }
				}
			
			return true;
		}
		return false;
	}
	
}
