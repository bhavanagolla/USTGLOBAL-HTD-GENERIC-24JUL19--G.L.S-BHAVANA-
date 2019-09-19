package com.dev.assignment;

public class MidElement {

	public static void main(String[] args) {
	int arr[] = {45,42,12,15,32,78,47};
	int mid,sec;
	mid =(arr.length)/2;
	sec = arr.length-2;
	System.out.println("Sum is: "+(arr[0]+arr[mid]+arr[sec]));
	System.out.println("Mid is:"+arr[mid]);
	System.out.println("Sec is:"+arr[sec]);

	}

}
