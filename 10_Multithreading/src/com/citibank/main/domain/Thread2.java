package com.citibank.main.domain;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In Thread2");
		for (int i=1;i<30;i++)
		{
			System.out.println("Thread2 :: "+ i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}