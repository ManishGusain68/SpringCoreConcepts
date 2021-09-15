package com.training.springCore.ref;

public class B {
	
  private int y;
  
  

public B() {
	super();
	System.out.println("i am being called from class B");
	// TODO Auto-generated constructor stub
}

public B(int y) {
	this.y = y;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

@Override
public String toString() {
	return "B [y=" + y + "]";
}
  
  
  
}
