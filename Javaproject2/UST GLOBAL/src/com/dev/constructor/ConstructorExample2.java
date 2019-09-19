package com.dev.constructor;

public class ConstructorExample2 {
	public ConstructorExample2() {
		System.out.println("Zero-argument");
	
	}
	
	public ConstructorExample2(int a,char b) {
		System.out.println("This const is with int and char arg");
	}
	
	public ConstructorExample2(char b,int a) {
		System.out.println("This const is with char and int arg");
	}
	
	public ConstructorExample2(int a) {
		System.out.println("This const is with int arg");
	
	}

	public ConstructorExample2(char b) {
		System.out.println("This const is with char arg");
	
	}

	
	public static void main(String[] args) {
		ConstructorExample2 ce = new ConstructorExample2 ();
		System.out.println(ce);
		ConstructorExample2 ce1 = new ConstructorExample2 (5,'M');
		System.out.println(ce1);
		ConstructorExample2 ce2 = new ConstructorExample2 ('M',5);
		System.out.println(ce2);
		ConstructorExample2 ce3 = new ConstructorExample2 (5);
		System.out.println(ce3);
		ConstructorExample2 ce4 = new ConstructorExample2 ('M');
		System.out.println(ce4);
		
		
		
	}

}
