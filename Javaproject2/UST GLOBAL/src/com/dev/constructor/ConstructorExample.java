package com.dev.constructor;

public class ConstructorExample {
	

	public ConstructorExample() {	//Default constructor
		System.out.println("This is no-arg const");
	}
	
	public ConstructorExample(int i) {	//parameterized constructor
		System.out.println("This const is with int arg");
	}
	public ConstructorExample(String s) {   //parameterized constructor
		System.out.println("This const is with String arg");
	}
	
	public ConstructorExample(int i,String s) {   //parameterized constructor
		System.out.println("This const is with int and string arg");
	
	}

	public ConstructorExample(String s,int i) {      //parameterized constructor
		System.out.println("This const is with string and int arg");
	
	}

	
	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample();
		ConstructorExample ce1 = new ConstructorExample(1);
		ConstructorExample ce2 = new ConstructorExample("M");
		ConstructorExample ce3 = new ConstructorExample(1,"M");
		ConstructorExample ce4 = new ConstructorExample("M",1);
		
		
	}

}
