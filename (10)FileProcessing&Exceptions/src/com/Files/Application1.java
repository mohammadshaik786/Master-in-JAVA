package com.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application1 {
	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter some text:");
		String output = input.nextLine();
		System.out.println(output);*/
		
		//We can add 2 types of exceptions for src/MyFile.txt.
		//They are add throw decleration in main and by using try/catch block
		
		try {
			File file = new File("src/MyFile.txt");
			Scanner input;

			input = new Scanner(file);

			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		}
		/*catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}*/
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		MyOwnExcep ex = new MyOwnExcep();
		try {
			System.out.println(ex.Substract10large(15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

/*
 * Note: e.printStackTrace() gives the type of exception
 */
