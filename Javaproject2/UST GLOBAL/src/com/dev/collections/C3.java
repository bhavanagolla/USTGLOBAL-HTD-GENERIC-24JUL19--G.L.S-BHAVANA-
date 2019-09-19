package com.dev.collections;

import com.dev.encapsulation.Dog;

import java.util.HashMap;


public class C3 {

	public static void main(String[] args) {
		HashMap<String,Dog> hm = new HashMap<String,Dog>();
		
		Dog d =new Dog();
		d.setAge(1);
		d.setBreed("Saint bernard");
		d.setColor("White and brown");
		d.setName("Zara");
		
		Dog d1 =new Dog();
		d1.setAge(2);
		d1.setBreed("Lab");
		d1.setColor("white");
		d1.setName("Bluffy");
		
		hm.put("1", d);
		hm.put("2", d1);
		
		System.out.println(hm);

		Dog f = hm.remove("2");
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("output of containsKey():"+hm.containsKey("1"));
		System.out.println("output of containsKey():"+hm.containsKey("d2"));
	}

}
