
package com.dev.contacts;

import java.util.HashSet;
import java.util.Scanner;

public class ContactList{
	Scanner sc = new Scanner(System.in);
	HashSet<Contact> ar = new HashSet<Contact>();
	public void contact(Contact value)
	{
		int w;
		do {
			System.out.println("enter 1 to call enter 2 to message");
			int i =sc.nextInt();
			if(i==1)
			{
				System.out.println("enter the number to call");
				long l =sc.nextLong();
				System.out.println("call......"+1);
				System.out.println("call ended");
			}
			else if(i==2)
			{
				System.out.println("enter the message");
				String s = sc.next();
				value.setMessage(s);
				System.out.println("message is sending");
				
			}
			System.out.println("enter 1 to continue 2 go out");
			w =sc.nextInt();
		}
		while(w==1);
			
		}
	public void editContact(Contact value)
	{
		System.out.println("enter name");
		String s3 = sc.next();
		value.setName(s3);
		
		System.out.println("enter phoneno");
		long s4 =sc.nextLong();
		value .setphoneno(s4);
		}
	
}

