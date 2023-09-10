package com.springcore.UserDefinedClassObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/UserDefinedClassObjectInjection/config.xml");
		A obj = (A) context.getBean("aref");
		System.out.println(obj);
		System.out.println(obj.getX());
		System.out.println(obj.getOb());
		System.out.println(obj.getOb().getY());

	}

}
