package com.springcore.autowireusingannotaion;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//	Field autowiring
//	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}
	
//	Method autowiring
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("setAddress");
		this.address = address;
	}
	
//	Constructor autowiring
//	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Emp");
		this.address = address;
		System.out.println("Constructor get called to inject dependency");
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
