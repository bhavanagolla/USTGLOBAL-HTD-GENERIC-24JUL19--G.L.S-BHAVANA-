package com.dev.abstraction;

public class Concrete2 extends Concrete1 {

	public static void main(String[] args) {
		Concrete2 c2 = new Concrete2();
		c2.walkable();
		c2.eat();
		c2.hunt();
	}
	void walkable() {
		System.out.println("Concrete2 is a class");
	}
	@Override
	void eat() {
		System.out.println("eat");
	}
	@Override
	void hunt() {
		System.out.println("hunt");

	}

}
