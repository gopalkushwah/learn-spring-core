package com.springcore.consturctorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/consturctorinjection/config.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
	}
}
