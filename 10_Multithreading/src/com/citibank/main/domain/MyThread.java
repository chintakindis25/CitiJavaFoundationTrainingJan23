package com.citibank.main.domain;

public class MyThread implements Runnable{

	private Resource resource;
	private String textMessage;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		resource.message(textMessage);
	}

	public MyThread(Resource resource, String message) {
		super();
		this.resource = resource;
		this.textMessage = message;
	}
}
