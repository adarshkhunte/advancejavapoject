package com.jspiders.filecreate;

import java.io.File;

import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\java\\Advance Java Mock\\FileCreate1");
		if (file.exists()) {
			System.out.println("file already exists");
			
				}
		else {
			file.createNewFile();
			System.out.println("file Created successfully");
			
		}
		System.out.println("name of file is :" +file.getName());
		System.out.println("name of file is :" +file.getAbsolutePath());

		if (file.canWrite()) {
			System.out.println("The file is writable");
			
		}
		if (file.canRead()) {
			System.out.println("The file is Readable");

			
		}
		if (file.canExecute()) {
			System.out.println("The file is Executable");

			
		}
		
		
		
				
	}

}
