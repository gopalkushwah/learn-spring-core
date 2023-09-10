package com.springcore.UserDefinedClassObjectConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/UserDefinedClassObjectConstructorInjection/config.xml");
		A obj = (A) context.getBean("aref");
		B bobj = (B) context.getBean("bref");
		System.out.println(bobj);
		System.out.println(obj);
		
	}

}
