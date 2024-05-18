package com.jspiders.filehandling;

import java.io.File;

public class Deletefile {
	
	public static void main(String[] args) {
		
		File file=new File("file.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("file is deleted");
			
		}
		else {
			System.out.println("file does not exists");
		}
	}

}
