package com.cognizant.spring_demo.dependancycheck;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/cognizant/spring_demo/dependancycheck/config.xml");
		Prescription pt = (Prescription) ctx.getBean("prescription");
		System.out.println(pt);
		
		ctx.close();
	
	}

}
