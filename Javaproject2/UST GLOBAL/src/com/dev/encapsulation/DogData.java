package com.dev.encapsulation;

public class DogData {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d1.setAge(1);
		d1.setName("Zara");
		d1.setBreed("Pug");
		d1.setColor("Black");
		
		d2.setAge(2);
		d2.setName("Spike");
		d2.setBreed("Geran Shepherd");
		d2.setColor("Brown");
		
		d3.setAge(3);
		d3.setName("Bluffy");
		d3.setBreed("Lab");
		d3.setColor("White");
		
		Dog [] d= {d1,d2,d3};
		for(int i=0;i<=d.length;i++)
		{
			System.out.println("Age: "+d[i].getAge());
			System.out.println("Name: "+d[i].getName());
			System.out.println("Breed: "+d[i].getBreed());
			System.out.println("Color: "+d[i].getColor());
		}
		
		
		
		
		
	}
}


