package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Some String";
		String str1= "Some String";
		int length = str.length();
		System.out.println(length);//length
		
		char[] ch = str.toCharArray();
		System.out.println(ch[10]);//to char array
	
		char c= str.charAt(3);
		System.out.println(c);//
		
		char c1= str.charAt(4);
		System.out.println("output for charAt() "+c1);
		
		boolean b = str.equals(str1);
		System.out.println("output for equals():"+b);//compare
		
		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println("output for EqualsIgnoreCase(): "+b1);
		
		
		}
		
		
		
	}


