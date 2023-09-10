package com.springcore.autowireusingannotaionAndQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
//	Field autowiring
//	@Autowired
//	@Qualifier("address")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
//	Method autowiring
//	@Autowired
//	@Qualifier("address")
	public void setAddress(Address address) {
		System.out.println("setAddress");
		this.address = address;
	}
	
//	Constructor autowiring
//	@Autowired
//	@Qualifier("address")
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
