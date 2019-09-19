package com.dev.inheritance;

public class GrandFather {
	static GrandFather g = new GrandFather();
	String name = "Bhavana";
	String lastName ="Golla";
	
	public static void main(String[] args) {
		g.printName();
		
	}
	public void printName() {
		//String name = "Bhavana"; // local variable
		System.out.println(name+ " "+g.lastName );
		
		
	}

}
