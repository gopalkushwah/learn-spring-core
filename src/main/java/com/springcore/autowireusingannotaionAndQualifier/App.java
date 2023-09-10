package com.springcore.autowireusingannotaionAndQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/autowireusingannotaionAndQualifier/config.xml");
		Emp emp1 = context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}
}
