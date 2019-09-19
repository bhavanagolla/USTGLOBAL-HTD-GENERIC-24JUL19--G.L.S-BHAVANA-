package com.dev.arrays;

public class MiddleElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		if(a.length%2==0) {
			System.out.println(a[a.length/2]);
			
			System.out.println(a[(a.length/2)-1]);
		}
		else {
			System.out.println(a[a.length/2]);
		}
	}
}
