package com.springcore.PropertiesCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/PropertiesCollection/config.xml");
		PropertiesCollections prop = (PropertiesCollections) context.getBean("db_conn");
		for (Object property : prop.getDb_connections().keySet()) {
//			System.out.println(prop.getDb_connections().get(property));
			System.out.println(prop.getDb_connections().getProperty((String)property));
		}

	}

}
