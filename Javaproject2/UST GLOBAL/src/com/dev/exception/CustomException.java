package com.dev.exception;

public class CustomException extends Exception {
	
	public CustomException () {
		System.out.println("Exception Occured");
	}
	
	public CustomException(int i) {
		System.out.println("Exception occured for integer");
	}
	public CustomException(String[] args) {
		System.out.println("Exception occured for Strings");
	}

	
}
