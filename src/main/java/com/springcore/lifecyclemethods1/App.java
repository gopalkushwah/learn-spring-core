package com.springcore.lifecyclemethods1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecyclemethods1/config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
		
		context.registerShutdownHook();
		
	}
}
