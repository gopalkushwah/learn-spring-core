package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student",Student.class);
		student.setId(0);
		student.setName("gopal");
		System.out.println(student);
		
	}
}
