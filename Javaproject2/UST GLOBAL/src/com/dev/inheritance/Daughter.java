package com.dev.inheritance;

public class Daughter extends Father {
	static Daughter d= new Daughter();
	@Override
	
	public void printName() {
		String name = "Saheli";
		System.out.println(name+" "+super.name+" "+d.lastName);
		
	}

	public static void main(String[] args) {
		d.printName();
		f.printName();
	}

}
