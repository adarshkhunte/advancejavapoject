package com.jspiders.filehandling;

public class Thread1 extends Thread{
	
	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		t.setName("MyThread");
		t.setPriority(4);
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		
	}

}
