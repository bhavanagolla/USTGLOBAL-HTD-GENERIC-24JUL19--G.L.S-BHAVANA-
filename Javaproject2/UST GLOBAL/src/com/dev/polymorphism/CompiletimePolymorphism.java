package com.dev.polymorphism;

public class CompiletimePolymorphism {
	static CompiletimePolymorphism c= new CompiletimePolymorphism();
		public void add(int i,int j) {
			int a=i+j;
			System.out.println("addition of 2 values: a= "+a);
			
		}
		public void add(int i,int j,int k) {
			int a=i+j+k;
			System.out.println("addition of 3 values: a= "+a);
		}
		public void add(int i,float d) {
			float a=i+d;
		System.out.println("addition of 2 values:a= "+a);
	}

	public static void main(String[] args) {
		c.add(10,8.45783f);
		c.add(1231,6763,35354);
		c.add(12,15435);
	

	}
	}

	

