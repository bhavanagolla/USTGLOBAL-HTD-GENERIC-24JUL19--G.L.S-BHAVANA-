package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRegno(68698);
		s.setName("Bhavana");
		s.setEmail("bhavana.golla167@gmail.com");
		s.setPassword("0000");
		
		
		System.out.println("Regno: "+s.getRegno());
		System.out.println("Name: "+s.getName());
		System.out.println("Email: "+s.getEmail());
		System.out.println("Password:"+s.getPassword());
		
	}
	

}
