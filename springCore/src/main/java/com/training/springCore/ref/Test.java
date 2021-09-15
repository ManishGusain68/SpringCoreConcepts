package com.training.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	   
		ApplicationContext context = new ClassPathXmlApplicationContext("com/training/springCore/ref/RefConfig.xml");
      A temp=(A) context.getBean("aref");
  
      System.out.println(temp);
      System.out.println(temp.getB().getY());
	}

}
