package com.cognizant.spring_demo.hasadependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependancy {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cognizant/spring_demo/hasadependency/config.xml");
		Employee emp = (Employee)ctx.getBean("employee");
		System.out.println(emp.hashCode());
		Employee emp1 = (Employee)ctx.getBean("employee");
		System.out.println(emp1.hashCode());
		
	}

}
