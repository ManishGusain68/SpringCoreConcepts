package com.training.constructorInjection;

public class Addition {
	private int x;
	private int y;
	
public Addition(int x,int y) 
{
	this.x=x;
	this.y=y;
	System.out.println("integer constructor");
}

public Addition(String x,String y) 
{
	this.x=Integer.parseInt(x);
	this.y=Integer.parseInt(y);
	System.out.println("String constructor");
	System.out.println("value of x is : "+this.x);
	System.out.println("value of y is : "+this.y);
}

public int add() 
{
	return x+y;
	
}

}
