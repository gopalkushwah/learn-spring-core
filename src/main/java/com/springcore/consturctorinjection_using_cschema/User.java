package com.springcore.consturctorinjection_using_cschema;

public class User {
	private int id;
	private String name;
	private String address;
	
	public User(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
