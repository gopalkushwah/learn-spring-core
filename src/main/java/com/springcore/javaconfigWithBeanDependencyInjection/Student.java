package com.springcore.javaconfigWithBeanDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private Courses course;

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public Student() {
		super();
	}
	
	@Autowired
	public Student(Courses course) {
		super();
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
	
}
