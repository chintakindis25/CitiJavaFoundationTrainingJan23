package com.citibank.main.domain;

public class Thread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("We are in Thread1");
		for (int i=1;i<30;i++)
		{
			System.out.println("Thread1 :: "+ i);
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}