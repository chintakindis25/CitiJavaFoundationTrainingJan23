package com.citibank.main;

import java.awt.Choice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileMetaData;
import com.citibank.main.domain.MyFileReader;
import com.citibank.main.domain.MyFileWriter;
import com.citibank.main.domain.ReadMyFile;
import com.citibank.main.domain.WriteMyFile;

public class MyFileMetaDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
	//MyFileMetaData	
//		MyFileMetaData myFileMetaData = new MyFileMetaData();
//		myFileMetaData.printFileMetaData();
//	//ReadMyFile	
//		ReadMyFile r = new ReadMyFile();
//		r.readFile();
//	//WriteMyFile	
//		Scanner scanner = new Scanner(System.in);
//		String path = "C:\\JavaTraining\\OutputFile.txt";
//		File file = new File(path);
//		OutputStream outputStream=null;
//		try {
//			outputStream = new FileOutputStream(file,true);
//			System.out.println();
//			System.out.println("Enter your message to be written to output file");
//			String message = scanner.nextLine();
//			WriteMyFile writeMyFile = new WriteMyFile(outputStream, message);
//			writeMyFile.writeFile();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("File not found exception ");
//			e.printStackTrace();
//		}finally
//		{
//			try {
//				outputStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("error while closing");
//				e.printStackTrace();
//			}
//		}		
//	//MyFileReader
//		System.out.println("MyFileReader start--------");
//		FileReader fileReader=null;
//		BufferedReader bufferedReader=null;
//		
//		try {
//			
//			fileReader = new FileReader(file);
//			bufferedReader = new BufferedReader(fileReader);
//			MyFileReader myFileReader = new MyFileReader(bufferedReader);
//			System.out.println(myFileReader.readFileLineByLine());
//						
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Error in read");
//			e.printStackTrace();
//		}finally
//		{
//			try {
//				fileReader.close();
//				bufferedReader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Error in close");
//				e.printStackTrace();
//			}
//			
//		}
//		System.out.println("MyFileReader end--------");
	
		//MyFileWriter
		String path = "C://JavaTraining//OutputFile1.txt";
		try {
			FileWriter fileWriter = new FileWriter(path,true);
			String data = "Text Line";
			MyFileWriter myFileWriter = new MyFileWriter(fileWriter, data);
			myFileWriter.writeFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}