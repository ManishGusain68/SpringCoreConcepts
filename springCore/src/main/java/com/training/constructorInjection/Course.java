package com.training.constructorInjection;

public class Course {

	public String name;
	
	public Course(String name)
	{System.out.println("Course constructor");
	this.name=name;	
	}
	
}
