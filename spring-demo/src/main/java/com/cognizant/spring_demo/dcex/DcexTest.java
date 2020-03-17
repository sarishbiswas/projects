package com.cognizant.spring_demo.dcex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DcexTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cognizant/spring_demo/dcex/config.xml");
		University uv = (University) ctx.getBean("university");
		System.out.println(uv.hashCode());
		
		University uv1 = (University) ctx.getBean("university");
		System.out.println(uv1.hashCode());
	}

}
