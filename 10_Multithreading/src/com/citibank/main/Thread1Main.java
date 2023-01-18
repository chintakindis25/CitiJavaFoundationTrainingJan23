package com.citibank.main;

import com.citibank.main.domain.Thread1;

public class Thread1Main {

	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
		System.out.println("MainStart");
		thread1.start();
		for (int i=1;i<30;i++)
		{
			System.out.println("Main:: "+ i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("MainEnd");
	//	thread1.run();
		
	}
}
