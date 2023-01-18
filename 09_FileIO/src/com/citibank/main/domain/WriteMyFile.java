package com.citibank.main.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//
public class WriteMyFile {
	private File file;
	private OutputStream outputStream;
	private String outMessage;

	public WriteMyFile(OutputStream outputStream, String outMessage) {
		super();
		this.outputStream = outputStream;
		this.outMessage = outMessage;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public OutputStream getOutputStream() {
		return outputStream;
	}

	public void setFileOutputStream(OutputStream outputStream) {
		this.outputStream = outputStream;
	}

	public String getOutMessage() {
		return outMessage;
	}

	public void setOutMessage(String outMessage) {
		this.outMessage = outMessage;
	}
	
	public boolean writeFile() {
		
		byte[] data = outMessage.getBytes(); 
		try {
			outputStream.write(data);
			System.out.println("Write Successful");
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Errorwhile writing");
			e.printStackTrace();
			return false;
		}
		finally
		{
			try {
				outputStream .close();
			}catch(IOException e)
			{
				System.out.println("Error while closing");
			}
		}
	}
}
