package com.javatpoint.FactoryInjectionType2;

public class PrintableFactory {
	public static Printable getPrintable() {
		return new B();
//		return new A();
	}
}
