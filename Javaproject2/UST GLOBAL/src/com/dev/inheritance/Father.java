package com.dev.inheritance;

public class Father extends GrandFather {
	
	static Father f = new Father();
	String name = "Ramana";
	 @Override
	
	public void printName() {
		
		  System.out.println(name+" "+super.name+" "+f.lastName);
		  super.printName();
	}
	public static void main(String[] args) {
		f.printName();
		g.printName();
	

		}
 
}
