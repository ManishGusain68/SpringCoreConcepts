package com.training.constructorInjection;

public class Person {

	private String name;
	private int personId;
	private String state;
	private Course crs;
	
	
	public Person(String name, String state) {
		
		this.name=name;
		this.state=state;
		
	}


	public Person(String name, int personId, Course crs) {
		System.out.println("Person constructor");
		this.name = name;
		this.personId = personId;
		this.crs=crs;
	}


	@Override
	public String toString() {
		return this.name+":"+this.personId + "{"+this.crs.name+"}";
	}
	
	
	
}
