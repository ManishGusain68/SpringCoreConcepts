package com.training.Autowiring;

public class Emp {

	private Address address;

	public Emp() {
		super();
		System.out.println("from default constructor of Emp class");
	}

	

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("from constructor of Emp class");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
