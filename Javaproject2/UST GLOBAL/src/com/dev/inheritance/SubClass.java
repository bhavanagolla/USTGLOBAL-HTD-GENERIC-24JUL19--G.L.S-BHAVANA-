package com.dev.inheritance;

public class SubClass extends SuperClass{
	
	public static void main(String[] args) {
		 SubClass sub = new SubClass();

	}
	public SubClass() {
		super(131);
		System.out.println("Const with no-arg of SuperClass");
	}
	
	public SubClass(int i) {
		System.out.println("Const with int arg of SuperClass");
	}
	
	public SubClass(String str) {
		System.out.println("Const with String arg of SuperClass");
	}
	
	public SubClass(String str,int i) {
		System.out.println("Const with String and int args of SuperClass");
	}

	public SubClass(int i,String str) {
		System.out.println("Const with int and String args of SuperClass");
	}


}
