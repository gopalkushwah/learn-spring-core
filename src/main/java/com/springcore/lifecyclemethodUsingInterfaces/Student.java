package com.springcore.lifecyclemethodUsingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	private int id;
	private String name;
	private String mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setting id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		System.out.println("setting mobile");
		this.mobile = mobile;
	}
	public Student(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
//		init method
		System.out.println("init method is calling");
	}
	@Override
	public void destroy() throws Exception {
//		destroy method
		System.out.println("destroy method is calling");
		
	}
}
