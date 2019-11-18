package com.iq;

class X
{	{
	System.out.println("x1");
    }
	Y b=new Y();
	X()
	{
		System.out.print("X");
	}	
}
class Y
{
	Y()
	{
		System.out.print("Y");
	}
}
public class Z extends X
{	
	private  volatile char value[];
	private volatile int i=3;
	
	
	
	
	
	
	{
	System.out.println("z1");
     }
	Y y=new Y();
	Z()
	{
		System.out.print("Z");
	}
	public static void main(String[] args)
	{
		
		new Z();
	}
}
