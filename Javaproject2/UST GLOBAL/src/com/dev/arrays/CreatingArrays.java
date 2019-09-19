package com.dev.arrays;

public class CreatingArrays {

	public static void main(String[] args) {
		int [] intArr;
		byte[] byteArr = new byte[5];//declaration and creation
		
		intArr = new int[5];//creation
		
		byteArr = new byte[5];
		 
		intArr[0] = 1;//initialization
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		
		
		byteArr[0] = 4;
		byteArr[1] = 3;
		byteArr[2] = 2;
		byteArr[3] = 6;
		byteArr[4] = 7;
		
		int res = intArr[0] + 3;
		int res1 = intArr[1] - 3;
		int res2 = intArr[2] * 3;
		int res3 = intArr[3] / 3;
		int res4 = intArr[4] % 3;
		
		System.out.println("addition = "+res);
		System.out.println("Sub = "+res1);
		System.out.println("mul = "+res2);
		System.out.println("div = "+res3);
		System.out.println("mod = "+res4);
		
		int[] intArr2 = {3,26,7,9,5};
		System.out.println(intArr2[2]);
		System.out.println("length of the 2nd Array: "+intArr2.length);
		
		
		
		
		}

}