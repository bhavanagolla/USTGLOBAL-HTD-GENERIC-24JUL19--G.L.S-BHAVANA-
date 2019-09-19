package com.dev.inheritance;

public class Class1 {
	static Class1 c1 = new Class1();
	String fruit = "Mango";
	String lastName = "Fruit";

	public static void main(String[] args) {
		c1.printName();
		
	}
	public void printName() {
		//String fruit = "Mango"; // local variable
		System.out.println(fruit+ " "+c1.lastName );
		
		
	}

}



