package com.dev.abstraction;
public abstract class AbstractExample {
	
	public AbstractExample() {
		System.out.println("constructor of Abstract class");
	}
	abstract void display();
	public void show() {
		System.out.println("concrete method of abstract class");
	}
}