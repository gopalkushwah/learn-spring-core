package com.springcore.javaconfigWithBeanDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Courses getCourses() {
		return new Courses();
	}
	
	@Bean(name="student")
	public Student getStudent() {
		return new Student(getCourses());
	}
}
