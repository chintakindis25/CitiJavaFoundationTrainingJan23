package com.citibank.main;

import com.citibank.main.domain.Thread2;
import com.citibank.main.domain.Thread1;
public class Thread12Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Main start");
		System.out.println("Main is creating child Threadone");
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		System.out.println("Main is creating child ThreadTwo");
		Thread2 thread2 = new Thread2();
		Thread thread = new Thread(thread2);
		thread.start();
	}

}
