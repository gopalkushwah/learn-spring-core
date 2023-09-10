package com.springcore.FactoryInjection;

public class MyBeanFactory {
//	for non-static method
//	public MyBean createMyBean() {
//        return new MyBean();
//    }
	
//	for static method
	public static MyBean createMyBean() {
        return new MyBean();
    }
}
