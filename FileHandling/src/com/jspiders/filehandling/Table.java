package com.jspiders.filehandling;

public class Table {

	public  synchronized void display(int n) {
		for(int i=2;i<=10;i++) {
			System.out.println(n*i);
		}
	}

}

class Thread2 extends Thread{
	Table t;
	
	public Thread2 (Table t) {
		this.t=t;
	}
	public void run() {
		t.display(5);
	}
}

class Thread3 extends Thread{
	Table t;
	
	public Thread3 (Table t) {
		this.t=t;
	}
	public void run() {
		t.display(8);
	}
}



	
	