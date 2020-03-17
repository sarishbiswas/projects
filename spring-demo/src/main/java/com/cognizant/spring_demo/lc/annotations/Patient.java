package com.cognizant.spring_demo.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void hi(){
		System.out.println("InIt method Invoked");
	}
	
	@PreDestroy
	public void bye(){
		System.out.println("Destroy method called");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
