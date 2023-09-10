package com.javatpoint.FactoryInjectionType1;

public class A {
	private static final A a = new A();
	private A() {
		System.out.println("private constructor");
		
	}
	public static A getA(){  
	    System.out.println("factory method ");  
	    return a;  
	}  
	public void msg(){  
	    System.out.println("hello user");  
	}  
}
