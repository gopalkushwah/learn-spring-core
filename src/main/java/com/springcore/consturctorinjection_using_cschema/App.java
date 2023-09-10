package com.springcore.consturctorinjection_using_cschema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/consturctorinjection_using_cschema/config.xml");
		User user = (User)context.getBean("user");
		User user1 = (User)context.getBean("user1");
		System.out.println(user);
		System.out.println(user1);
	}
}
