package com.citibank.main;

import com.citibank.main.domain.Thread2;

public class Thread2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread2 thread2 = new Thread2();
		Thread thread = new Thread(thread2);
		
		thread.start();
		for (int i=1;i<30;i++)
		{
			System.out.println("Main:: "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
