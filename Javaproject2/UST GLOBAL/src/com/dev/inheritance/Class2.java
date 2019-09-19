package com.dev.inheritance;

public class Class2 extends Class1{
	static Class2 c2= new Class2();
	String name = "Apple";
	public void printName() {
		
		  System.out.println(name+" "+super.lastName+" "+c2.name);
	}
	public static void main(String[] args) {
		c2.printName();
	}
	

}
