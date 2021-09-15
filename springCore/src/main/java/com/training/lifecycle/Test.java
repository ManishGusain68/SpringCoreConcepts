package com.training.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/training/lifecycle/LifeCycle.xml");
		// registring shutdown hook
		context.registerShutdownHook();

		Samosa s1 = (Samosa) context.getBean("sam");
		System.out.println(s1);

		System.out.println("********************************************************");
		Pepsi p1 = (Pepsi) context.getBean("pep");
		System.out.println(p1);
	
	Example e=(Example) context.getBean("example");
	
	System.out.println(e);
	}

}
