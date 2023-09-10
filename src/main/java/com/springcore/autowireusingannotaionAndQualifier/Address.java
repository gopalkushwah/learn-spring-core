package com.springcore.autowireusingannotaionAndQualifier;

public class Address {
	private String street;
	private String city;
	
	public String getStreet() {
		System.out.println("getStreet");
		return street;
	}
	
	public void setStreet(String street) {
		System.out.println("setStreet");
		this.street = street;
	}
	
	public String getCity() {
		System.out.println("getCity");
		return city;
	}
	
	public void setCity(String city) {
		System.out.println("setCity");
		this.city = city;
	}
	
	public Address(String street, String city) {
		super();
		System.out.println("Address");
		this.street = street;
		this.city = city;
	}
	
	public Address() {
		super();
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
