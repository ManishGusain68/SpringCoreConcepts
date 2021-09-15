package com.training.lifecycle;

public class Samosa {
private double price;

public Samosa() {
	super();
	System.out.println("inside cons of samosa");
	
	
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting the price of samosa");
	this.price = price;
}

@Override
public String toString() {
	
	return "Samosa [price=" + price + "]";
}


public void init() {
	System.out.println("inside init method of samosa");
}


public void destroy()
{
	System.out.println("inside destroy method of samosa");
}
}
