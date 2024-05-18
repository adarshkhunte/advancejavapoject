package com.jspiders.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteDemo {
	public static void main(String[] args) throws IOException {
		
		File file=new File("bytestream.txt");
		if (file.exists()) {
			System.out.println("file already exists");
			
		}
		else {
			file.createNewFile();
			System.out.println("file created");
			
			try {
				FileOutputStream fileOutputStream=new FileOutputStream(file);
				fileOutputStream.write(20);
				System.out.println("Data wriiten to the file");
				fileOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
