package com.dev.collections;

import java.util.Scanner;

public class ProductInfoMainClass {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int button;
		
		ProductInt p1 = new ProductInt();
	    p1.setProductId(123);
		p1.setProductName("Trouser");
		p1.setProductCost(4533);
		p1.setProductColor("blue");
		p1.setDescription("Trouser from flipkart with high quality");
		
		ProductInt p2 = new ProductInt();
	    p2.setProductId(124);
		p2.setProductName("Shirt");
		p2.setProductCost(2000);
		p2.setProductColor("Red");
		p2.setDescription("Red from flipkart with high quality");
		
		ProductInt p3 = new ProductInt();
	    p3.setProductId(125);
		p3.setProductName("kurti");
		p3.setProductCost(1000);
		p3.setProductColor("blue");
		p3.setDescription("kurti from flipkart with high quality");
		
		System.out.println("press 1 Enter the product should be display");
		
		Scanner scr = null;
		int buttonPress1 = scr.nextInt();
		if(buttonPress1==1);
		{
			ProductInt ps = null;
			ps.putData("1",p1);
			ps.putData("2",p2);
			ps.putData("3",p3);
			
		}
		{
			System.out.println("press 2 to buy the product");
			int buttonPress2 = scr.nextInt();
			if(buttonPress2==2);
			{
				ProductInt ps = null;
				ps.putData("1",p1);
				{
					System.out.println(ProductInt.hs);
				}
				
			}
		}
		
		
	}

}
