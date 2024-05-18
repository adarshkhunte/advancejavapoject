package com.jspiders.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharWriteDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("charstream.txt");
		
		
		if (file.exists()) {
			System.out.println("file already exists");
			
		}
		else {
			try {
				file.createNewFile();
				System.out.println("file created successfully");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		try {
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("Data from program");
			System.out.println("Data written to file");
			fileWriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
