package com.dev.assignment;

public class Reverse {

	public static void main(String[] args) {
		int[] arr =new int[] {12,15,14,11,23};
		System.out.println("original array:");
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
		System.out.println("Array in reverse order");
		for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i] + "");
	}
		
		
		

	}

}
