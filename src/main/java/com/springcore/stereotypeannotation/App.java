package com.springcore.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/stereotypeannotation/config.xml");
		Person person1 = context.getBean("person",Person.class);
		System.out.println(person1);
		Person person2 = context.getBean("person",Person.class);
		System.out.println(person2);
	}
}
