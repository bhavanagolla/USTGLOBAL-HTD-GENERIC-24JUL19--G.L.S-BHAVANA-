package com.dev.methods;

public class Method {
			static int a=10;
			static char c='A';
			static String s="hai hello";
			
	public static int areaOfSquare(int side)
	
	{
		int x=10;
		System.out.println("global variable ="+x);
		int area=side*side;
		return area;
	}
	public int areaOfRec(int base,int width) {
		System.out.println("global variable ="+c);
		int area1=base*width;
		return area1;
	}
	
	public static void main(String[] args) {
		//static members
		int side = 10;
		int a=areaOfSquare(10);
		System.out.println("Area of square having side "+side+" = "+a);
		System.out.println("global variable ="+s);
		//non static members
		Method m1 = new Method();
		int a1=m1.areaOfRec(5,8);
		System.out.println("Area of rectangle ="+a1);
		System.out.println("global variable ="+a1);
				
		


	}
	public static int calcArea(int i) {
		
		return 0;
	}

}
