package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> address; 
	private Set<String> phones; 
	private Map<String,String> workingTechs;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> address, Set<String> phones, Map<String, String> workingTechs) {
		super();
		this.name = name;
		this.address = address;
		this.phones = phones;
		this.workingTechs = workingTechs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getWorkingTechs() {
		return workingTechs;
	}
	public void setWorkingTechs(Map<String, String> workingTechs) {
		this.workingTechs = workingTechs;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", phones=" + phones + ", workingTechs=" + workingTechs
				+ "]";
	} 
	
	
}
