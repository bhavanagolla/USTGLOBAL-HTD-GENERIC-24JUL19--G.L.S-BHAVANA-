package com.dev.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Print Statement before");
		t();
		System.out.println("Print Statement after");
				 
				 
	}
	public static void s() {
//		StringBuffer sb = new StringBuffer(-1);
	}
	public static void t() {
		s();
	}


}