package com.dev.inheritance;

public class Child  extends Parent{

	public static void main(String[] args) {
		Parent p = new Parent();
		p.display(10);
		Child c = new Child();
		c.display(12);
		
		
	}
	@Override
	public void display(int i)
	{
		for(int j=1;j<1;j++)
		{
			System.out.println(j);
		}
	}

}
