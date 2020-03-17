package com.cognizant.spring_demo.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hi(){
		System.out.println("InIt method Invoked");
	}
	
	public void bye(){
		System.out.println("Destroy method called");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet");
	}

	public void destroy() throws Exception {
		System.out.println("Inside Destroy");
	}

}
