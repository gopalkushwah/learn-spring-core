package com.javatpoint.FactoryInjectionType1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("com/javatpoint/FactoryInjectionType1/config.xml");  
	    A a=(A)context.getBean("a");  
	    a.msg();  
	}  
}
