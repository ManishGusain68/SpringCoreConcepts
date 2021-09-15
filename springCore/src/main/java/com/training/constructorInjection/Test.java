package com.training.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		
			ApplicationContext context = new ClassPathXmlApplicationContext("com/training/constructorInjection/CIConfig.xml");
			System.out.println("here"); 
			Person pson=(Person) context.getBean("person");
	         
	         System.out.println(pson);
		
	     Addition ad=(Addition) context.getBean("add");
	    System.out.println(ad.add());
	}

}
