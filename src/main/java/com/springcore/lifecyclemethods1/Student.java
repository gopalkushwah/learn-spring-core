package com.springcore.lifecyclemethods1;

public class Student {
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
	
	public void init() {
		System.out.println("bean is initializing");
	}
	
	public void destroy() {
		System.out.println("destroying bean");
	}
}
