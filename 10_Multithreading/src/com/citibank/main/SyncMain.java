package com.citibank.main;

import com.citibank.main.domain.MyThread;
import com.citibank.main.domain.Resource;
import com.citibank.main.domain.Thread1;

public class SyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread thread = Thread.currentThread();
//		System.out.println(thread);
//		thread.setName("Main Thread");
//		thread.setPriority(2);
//		System.out.println(thread);
//		Resource resource = new Resource();
//		resource.message("Hi");
//		resource.message("Hello");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		resource.message("How are you doing today? ");
		
	Resource resource = new Resource();
	
	MyThread myThread1 = new MyThread(resource, "Hi");
	Thread thread1 = new Thread(myThread1);
	thread1.start();
	
	MyThread myThread2 = new MyThread(resource, "Hello");
	Thread thread2 = new Thread(myThread2);
	thread2.start();	
	
	MyThread myThread3 = new MyThread(resource, "How are you? ");
	Thread thread3 = new Thread(myThread3);
	thread3.start();
	
	}
}
