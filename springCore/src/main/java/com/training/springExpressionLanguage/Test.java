package com.training.springExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/training/springExpressionLanguage/Config.xml");
		
		Demo d=(Demo) context.getBean("demo");
		System.out.println(d);
		
		
		//another way:
//SpelExpressionParser temp=new SpelExpressionParser();
//Expression expression=temp.parseExpression("2+2");
//System.out.println(expression.getValue());
	}

}
