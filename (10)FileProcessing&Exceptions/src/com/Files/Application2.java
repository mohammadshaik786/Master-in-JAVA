package com.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Buffered File Reader with try catch block
//FileReader - reads entire file
//BuffredReader - reads line to line
public class Application2 {

	public static void main(String[] args) {
		
		File file = new File("src/MyFile.txt");
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			String line = bufferReader.readLine();
			
			while(line != null ){
				
				System.out.println(line);
				line = bufferReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem Reading the file" +file.getName());
			e.printStackTrace();
		}
		finally{
			try {
				bufferReader.close();
			} catch (IOException e) {
				System.out.println("Unable to close the file" + file.getName());
				e.printStackTrace();
			} catch (NullPointerException e){
				System.out.println("When worng file is given, it gives null pointer exception");
			}
			
			/*//To avoid null pointer exception in catch block
			try{
				if(bufferReader != null){
					bufferReader.close();
				}
				if(fileReader != null){
					fileReader.close();
				}
			}catch (IOException e) {
				System.out.println("Unable to close the file" + file.getName());
				e.printStackTrace();
			}*/
		}
		
		
		/*
		 * Till 1.6, final block is used to close the resources.
		 * But now from java 1.7, we directly initialize inside the try defination,So that the resources close automatically 
		 * i.e it uses 	AutoClosable interface
		
		File file = new File("src/MyFile1.txt");
		 
		try (FileReader fileReader = new FileReader(file);
		     BufferedReader bufferReader = new BufferedReader(fileReader);){
			
			
			String line = bufferReader.readLine();
			
			while(line != null ){
				
				System.out.println(line);
				line = bufferReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem Reading the file" +file.getName());
			e.printStackTrace();
		}
		 
		 */

	}

}
