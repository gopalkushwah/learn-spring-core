package com.springcore.lifecyclemethodUsingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/lifecyclemethodUsingAnnotation/config.xml");
//		Student student = (Student)context.getBean("student");
//		System.out.println(student);
		
		context.registerShutdownHook();
		
//		---------------------------------------------------
		System.out.println("---------------------------------------------------");
		Student student1 = (Student)context.getBean("student1");
		System.out.println(student1);
		
	
	}
}
