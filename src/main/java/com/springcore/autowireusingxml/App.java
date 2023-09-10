package com.springcore.autowireusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=
//				byName configuration
//				new ClassPathXmlApplicationContext("com/springcore/autowireusingxml/byNameconfig.xml");

//				byType configuration
//				new ClassPathXmlApplicationContext("com/springcore/autowireusingxml/byTypeconfig.xml");

//				by constructor
				new ClassPathXmlApplicationContext("com/springcore/autowireusingxml/constructorConfig.xml");
		
		Emp emp1 = context.getBean("emp1",Emp.class);
		System.out.println(emp1);
//		--------------------------------------------------------------------------
		
		
		
	}

}
