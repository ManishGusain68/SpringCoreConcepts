package com.training.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/training/stereotype/stereoConfig.xml");
		
		Student std=(Student) context.getBean("ob");
//		System.out.println(std);
//		System.out.println(std.getAddress());
//		System.out.println(std.getAddress().getClass().getName());
	
		System.out.println(std.hashCode());
		Student std2=(Student) context.getBean("ob");
		System.out.println(std2.hashCode());
		
		Teacher teach1=(Teacher) context.getBean("teacher");
		Teacher teach2=(Teacher) context.getBean("teacher");
		System.out.println(teach1.hashCode());
		System.out.println(teach2.hashCode());
		
	}

}
