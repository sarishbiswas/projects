package com.cognizant.spring_demo;

public class Address {
	private String houseName;
	private String city;
	private String country;
	
	public Address(){
		
	}
	public Address(String houseName, String city, String country) {
		super();
		this.houseName = houseName;
		this.city = city;
		this.country = country;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [houseName=" + houseName + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}
