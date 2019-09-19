package com.dev.arrays;

public class UsingLoops {

	public static void main(String[] args) {
		int n=2;
		int[] a= {1,2,3,4,5,6};
		if(n<=a.length) {
			System.out.println("index present");
			for(int i=0;i<=n;i++){
				System.out.println(a[i]);
			}
		}
		else
		{
			System.out.println("index not present");
		}
	}

}
