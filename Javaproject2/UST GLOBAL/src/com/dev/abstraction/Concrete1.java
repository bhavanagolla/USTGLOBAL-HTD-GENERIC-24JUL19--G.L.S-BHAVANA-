package com.dev.abstraction;

public class Concrete1 extends Abstract1{

	public static void main(String[] args) {
		Concrete1 c= new Concrete1();
		c.eat();
		c.hunt();
	}
	@Override
	void eat() {
		System.out.println("Abstract class");
	}
	@Override
	void hunt() {
		System.out.println("Concrete class");
	}
	public Concrete1() {
		System.out.println("constructor of Concrete1 class");
		

	}

}
