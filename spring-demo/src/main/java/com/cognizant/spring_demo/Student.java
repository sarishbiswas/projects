package com.cognizant.spring_demo;

public class Student {
	private String name;
	private Address address;
	private String subject;
	public Student(String name, String subject ,Address address) {
		super();
		this.name = name;
		this.address = address;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", subject=" + subject + "]";
	}
	
	
	
}
