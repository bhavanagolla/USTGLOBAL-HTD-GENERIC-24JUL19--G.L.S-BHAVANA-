package com.dev.collections;

import java.util.HashSet;

public class C2 {

	public static void main(String[] args) {
		HashSet<Employee> hs =new HashSet<Employee>();
		
		Employee e1 = new Employee();
		e1.setId(20);
		e1.setName("Bhavana");
		e1.setEmail("bhavana.golla167@gmail.com");
		e1.setPassword("bhavana5456");
		
		Employee e2 = new Employee();
		e2.setName("Jithin");
		e2.setId(21);
		e2.setEmail("jithin.golla167@gmail.com");
		e2.setPassword("jithin5456");
		
		Employee e3 = new Employee();
		e3.setName("Deekshitha");
		e3.setId(22);
		e3.setEmail("deekshitha.golla167@gmail.com");
		e3.setPassword("deekshitha5456");
		
		Employee e4 = new Employee();
		e4.setName("Akshitha");
		e4.setId(23);
		e4.setEmail("akshitha.golla167@gmail.com");
		e4.setPassword("null");
		
		boolean b1 = hs.add(e1);
		boolean b2 = hs.add(e2);
		boolean b3 = hs.add(e3);
		boolean b4 = hs.add(e4);
		
		System.out.println("output of add(): "+b1+" "+b2+" "+b3+" "+b4);
		System.out.println(hs);
		
		boolean b5 = hs.remove(e2);
		System.out.println("output of remove():"+b5);
		System.out.println(hs);
		
		
		
		
		
		
		
		
		
		
	}

}
