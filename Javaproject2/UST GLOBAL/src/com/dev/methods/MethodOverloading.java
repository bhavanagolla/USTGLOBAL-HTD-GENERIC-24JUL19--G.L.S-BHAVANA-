package com.dev.methods;

public class MethodOverloading {
	static MethodOverloading mo = new MethodOverloading();

	public void print() {
	 System.out.println("This is print method with no-arg");
	}
	 public int print(int i) {
		System.out.println("This is print method with int arg");
		return 1;
	}
	 static String print(String str) {
		 System.out.println("This is print method with string arg");
		 return "M";
	 }
	public static void main(String[] args) {
		mo.print("M");
		

	}

}
