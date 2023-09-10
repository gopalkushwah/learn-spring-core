package com.springcore.UserDefinedClassObjectConstructorInjection;

public class A {
	private int x;
	private B ob;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
	
}
