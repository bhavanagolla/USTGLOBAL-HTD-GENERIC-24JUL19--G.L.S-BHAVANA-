package com.dev.strings;

public class OwnString {
	public static void main(String[] args) {

	String str = "Some_String";
	String str1= "Some_String";
	
	int length = str.length();
	System.out.println(length);//length
	
	char[] ch = str.toCharArray();
	System.out.println(ch[10]);//to char array

	char c= str.charAt(3);
	System.out.println(c);//
	
	char c1= str.charAt(4);
	System.out.println("output for charAt() "+c1);//charAt
	
	boolean b = str.equals(str1);
	System.out.println("output for equals():"+b);//compare two strings
	
	boolean b1 = str.equalsIgnoreCase(str1);
	System.out.println("output for EqualsIgnoreCase(): "+b1);//ignore
	
	boolean v = str.contains("Mom");
	System.out.println("Output for contains(): "+v);//contains
	
	String g =str.replace('S','A');
	System.out.println("Output for replace('S','A'): "+g);//replace
	
	int f = str.indexOf('S');
	System.out.println("Output for indexOf('S'): "+f);//indexOf
	
	String s = str.toUpperCase();
	System.out.println(s);//Upper case
	
	String h = str.toLowerCase();
	System.out.println(h);//lower case
	
	String a = str.substring(3);
	System.out.println("Output for substring(): "+a);//substring Of beginning index
	
	String q = str.substring(3,9);
	System.out.println("Output for substring(int,int): "+q);//substring of(beginning,ending)
	

//Reference variable
	char[] c2 = new char[5];
	System.out.println("char [] = "+c2);
	
	
	}
}
	


