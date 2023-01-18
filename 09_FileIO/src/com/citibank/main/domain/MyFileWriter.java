package com.citibank.main.domain;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class MyFileWriter {

 	private String data;
//	private int length;
//	private File file;
	private Writer writer;
	
	public MyFileWriter(Writer writer,String data) {
		// TODO Auto-generated constructor stub
		super();
		this.writer = writer;
		this.data = data;
	}
	public boolean writeFile()
	{
		try {
			writer.write(data);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while Write");
			e.printStackTrace();
			return false;
		}finally
		{
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while close");
				e.printStackTrace();
			}
		}
	}
	
}
