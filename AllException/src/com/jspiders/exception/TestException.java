package com.jspiders.exception;

public class TestException {

	public static void validateAge(int age) throws InvalidAgeException {
		if (age<18) {
			throw new Exception();
			System.out.println("invalid age");
			
		}
		else {
			System.out.println("valid age");
			
		}
	}
	public static void main(String[] args) {
		
		try {
			validateAge(15);
			
		} catch (Exception e) {
			System.out.println(" please enter valid age");	
		}
	}
}

