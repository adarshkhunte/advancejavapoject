package com.jspiders.filehandling;

public class Main {
public static void main(String[] args) {
		
		Table t=new Table();
		Thread2 th1=new Thread2(t);
		Thread3 th2=new Thread3(t);
		th1.start();
		th2.start();
	}
}



