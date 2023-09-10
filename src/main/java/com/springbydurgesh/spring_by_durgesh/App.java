package com.springbydurgesh.spring_by_durgesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student st1 = (Student)context.getBean("student1");
        System.out.println(st1);
        
//        Emp em1 = (Emp)context.getBean("emp1");
//        System.out.println(em1);
    }
}
