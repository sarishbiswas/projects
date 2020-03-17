package com.cognizant.spring_demo.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/cognizant/spring_demo/lc/xmlconfig/config.xml");
		Patient pt = (Patient) ctx.getBean("patient");
		System.out.println(pt);
		ctx.registerShutdownHook();
		ctx.close();
	}

}
