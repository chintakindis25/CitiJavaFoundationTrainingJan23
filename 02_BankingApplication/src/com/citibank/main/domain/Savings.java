package com.citibank.main.domain;

public class Savings extends Account {
	private boolean isSalary;
		
	public Savings() {
		// TODO Auto-generated constructor stub
	}	
	public Savings(int accountNumber, String name, double balance, boolean isSalary)
	{
		super(accountNumber,name,balance);
		this.isSalary = isSalary;
	}
	
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0 && amount <= getBalance())
		{
			if(isSalary() == true)
			{
				setBalance(getBalance() - amount);
				return true;
			}
			else
			{
				if ((getBalance() - amount)>=1500)
				{
					setBalance(getBalance() - amount);
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
}
