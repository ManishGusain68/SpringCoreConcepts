package com.training.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public Pepsi() {
		super();
		System.out.println("inside the cons of Pepsi");

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price of pepsi");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method of pepsi");

	}

	public void destroy() throws Exception {
		System.out.println("destroy method of Pepsi");

	}

}
