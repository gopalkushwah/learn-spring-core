package com.springcore.stereotypeannotation.Scope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")  //default scope for a bean , it return only one reference(address) for all object 
@Scope("prototype")  //it returns different reference every time when we create instance
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
