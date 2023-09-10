package com.springcore.StandaloneCollection;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/StandaloneCollection/config.xml");
		Person person1 = context.getBean("person1",Person.class);
		System.out.println(person1);
		Person person2 = context.getBean("person2",Person.class);
		Set<Object> keySet = person2.getDbProp().keySet();
		for(Object keys : keySet) {
			System.out.println(person2.getDbProp().getProperty((String)keys));
		}
	}
}
