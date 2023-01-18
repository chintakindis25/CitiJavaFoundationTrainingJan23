package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {
	private String path = "C:\\JavaTraining\\InputFile.txt";
	private InputStream inputStream;
	private byte[] data;
	private int arrayLength;
	public void readFile() {
		try 
		{
			File file = new File(path);
			arrayLength = (int) file.length();
			data = new byte [arrayLength];
			inputStream = new FileInputStream(path);
			inputStream.read(data); 
			for(int i=0;i<data.length; i++)
			{
				System.out.print((char)data[i]);
			}
			for(byte b:data)
			{
				System.out.print((char) b);
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found !!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in reading..!!");
			e.printStackTrace();
		}
		finally
		{
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Failed to close file  !!");
				e.printStackTrace();
			}
			
		}
		
	}
}
