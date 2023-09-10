package com.springcore.javaconfigWithBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	
//	@Bean   //to call the bean by the name of method "getStudent"
//	@Bean("student")  //to call the bean by the name by the provided name "student"
//	Or
//	@Bean(name = "student")  //to call the bean by the name by the provided name "student"
//	Or
	@Bean(name = {"student","student1","student2"})  //to call the bean by the name by the provided name "student","student1","student2"
	@Scope("prototype")  //to change the bean reference on every object creation 
	public Student getStudent() {
		return new Student();
	}
}
