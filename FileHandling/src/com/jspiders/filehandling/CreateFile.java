package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
		File file=new File("file.txt");
		
		if (file.exists()) {
			System.out.println("file already exists");
			
			
		}
		else {
			file.createNewFile();
			System.out.println("file created successfully");
		}
		System.out.println("name of the file is"+file.getName());
		System.out.println("path of the file is"+file.getAbsolutePath());
		
		if (file.canWrite()) {
			System.out.println("file can be written");
			
		}
		if (file.canRead()) {
			System.out.println("file can be read");
			
		}
		if (file.canExecute()) {
			System.out.println("file can be executable");
			
		}
		
		
	}

}
