package com.cognizant.spring_demo.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("reftypeContext.xml");
		Student st =(Student)ctx.getBean("student");
		System.out.println(st);
	}

}
