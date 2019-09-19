package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;

public class C4 {

	public static void main(String[] args) {
		ArrayList<Dog> arl = new ArrayList<Dog>();
		
		Dog d =new Dog();
		d.setAge(5);
		d.setBreed("Saint bernard");
		d.setColor("White and brown");
		d.setName("Zara");
		
		Dog d1 =new Dog();
		d1.setAge(2);
		d1.setBreed("Lab");
		d1.setColor("white");
		d1.setName("Bluffy");
		
		arl.add(d);
		arl.add(d1);
		
		System.out.println(arl);
		System.out.println("size of ArrayList before trimToSize(): "+arl.size());
		
		
	}

}
