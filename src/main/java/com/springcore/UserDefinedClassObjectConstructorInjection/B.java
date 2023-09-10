package com.springcore.UserDefinedClassObjectConstructorInjection;

public class B {
	private int y;

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public B(int y) {
		super();
		this.y = y;
	}


	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
	
}
