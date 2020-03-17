package com.cognizant.spring_demo.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_demo.reftypes.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("shopingCartContext.xml");
		ShoppingCart st = (ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(st);
	}
}
