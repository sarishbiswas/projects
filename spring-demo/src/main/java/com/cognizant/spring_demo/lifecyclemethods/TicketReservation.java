package com.cognizant.spring_demo.lifecyclemethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	@PostConstruct
	public void hi(){
		System.out.println("hi invocked");
	}
	
	@PreDestroy
	public void bye(){
		System.out.println("Bye Invocked");
	}
}
