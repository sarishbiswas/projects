package com.cognizant.spring_demo.lc.xmlconfig;

public class Patient {
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

}
