package com.springcore.javaconfigWithBeanDependencyInjection;

import org.springframework.beans.factory.annotation.Value;

public class Courses {
	@Value("java")
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Courses() {
		super();
	}
	public Courses(String courseName) {
		super();
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + "]";
	}
	
}
