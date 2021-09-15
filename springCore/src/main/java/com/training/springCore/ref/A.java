package com.training.springCore.ref;

public class A {
  public A() {
		super();
	System.out.println("i m being called");
	}
private int x;
  private B b;
  
  
public A(int x, B b) {
	this.x = x;
	this.b = b;
}
public int getX() {
	return x;
}
public void setX(int x) {
	System.out.println("setting x");
	this.x = x;
}
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}
@Override
public String toString() {
	return "A [x=" + x + ", b=" + b + "]";
}
  
  
}
