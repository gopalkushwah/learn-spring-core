package com.springcore.stereotypeannotation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	@Value("Gopal")
	private String name;
	@Value("Bhopal")
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person() {
		super();
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	
}
