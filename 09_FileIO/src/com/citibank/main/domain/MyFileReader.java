package com.citibank.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
	private char[] data;
	private int length;
	private File file;
	private Reader reader;
	private BufferedReader bufferedReader;
	
	public MyFileReader(File file, Reader reader) {
		super();
		this.file = file;
		this.reader = reader;
	}

	public MyFileReader(BufferedReader bufferReader) {
		// TODO Auto-generated constructor stub
		this.bufferedReader = bufferReader;
	}
	
	public String readFileLineByLine()
	{
		String fileData="";
		int i=1;
		try {
			String temp = bufferedReader.readLine();
			do {
				fileData = "Line "+ i++ + fileData + temp + "\n";
				temp = bufferedReader.readLine();
//				if (temp.equals("Hi"))
//				{
//					
//				}else
//				{
//					
//				}
			}while(temp != null);
			return temp;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in read");
			e.printStackTrace();
			return "";
		}finally
		{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in bufferedReader close");
				e.printStackTrace();
			}
		}
	}
	public String readFile()
	{
		try {
			length = (int)file.length();
			data = new char[length];
			reader.read(data);
			String readData = new String(data);
			return readData;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in reading file");
			e.printStackTrace();
		}finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error while closing file");
				e.printStackTrace();
			}
		}
		return "";
	}
	
	
	
}
