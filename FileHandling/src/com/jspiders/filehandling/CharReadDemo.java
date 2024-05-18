package com.jspiders.filehandling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CharReadDemo {
	public static void main(String[] args) {
		
		File file =new File("charstream.txt");
		if (file.exists()) {	
			try {
				FileReader fileReader=new FileReader(file);
				fileReader.read();
				System.out.println("Data read from file");
				fileReader.close();
				
				Scanner scanner=new Scanner(file);
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("file does not exists");
		}
		
	}

}
