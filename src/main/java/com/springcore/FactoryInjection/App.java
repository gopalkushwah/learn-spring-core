package com.springcore.FactoryInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/FactoryInjection/config.xml");
		MyBean myBean = context.getBean("myBean",MyBean.class);
		System.out.println(myBean);
	}
}
