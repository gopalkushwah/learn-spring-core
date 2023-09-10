package com.springcore.javaconfigWithBeanDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}
}
