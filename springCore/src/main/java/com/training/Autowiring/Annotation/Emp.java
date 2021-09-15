package com.training.Autowiring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address1")
	private Address address;
	private String name;
	
	public Emp() {
		super();
		System.out.println("from default constructor of Emp class");
	}

	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("from constructor of Emp class");
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setting name of employee");
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;

	}

	@Override
	public String toString() {
		return "Emp [address=" + address +"name ="+name+ "]";
	}

}
