package com.cognizant.spring_demo.lifecyclemethods;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/cognizant/spring_demo/lifecyclemethods/config.xml");
		TicketReservation pt = (TicketReservation) ctx.getBean("ticket");
		//System.out.println(pt);
		ctx.close();
	
	}

}
