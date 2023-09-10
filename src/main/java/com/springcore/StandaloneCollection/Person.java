package com.springcore.StandaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<String> friends;
	private Map<String, Double> feestructure;
	private Set<String> mobile;
	private Properties dbProp;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Double> getFeestructure() {
		return feestructure;
	}
	public void setFeestructure(Map<String, Double> feestructure) {
		this.feestructure = feestructure;
	}
	
	public Set<String> getMobile() {
		return mobile;
	}
	public void setMobile(Set<String> mobile) {
		this.mobile = mobile;
	}
	
	public Properties getDbProp() {
		return dbProp;
	}
	public void setDbProp(Properties dbProp) {
		this.dbProp = dbProp;
	}
	@Override
	public String toString() {
		return " Person [\nfriends=" + friends + ",\n feestructure=" + feestructure + ",\n mobile=" + mobile + ",\n dbProp="
				+ dbProp + "]";
	}
	
	
	
	
}
