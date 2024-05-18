package com.jspiders.filehandling;

public class SleepDemo {
	
	public static void main(String[] args) {
		
		String message="This is magic of sleep method";
		char[] messageArray=message.toCharArray();
		
		for(int i=0;i<message.length();i++) {
			System.out.print
			(messageArray[i]);
			
			try {
				Thread.sleep(70);
				
			} catch (Exception e) {
			
			}
		}
	}

}
