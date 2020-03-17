package com.cognizant.spring_demo;

public class Organization {
	private String orgName;
	private String EmpType;
	public Organization(String orgName, String empType) {
		super();
		this.orgName = orgName;
		EmpType = empType;
	}
	public Organization() {
		super();
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getEmpType() {
		return EmpType;
	}
	public void setEmpType(String empType) {
		EmpType = empType;
	}
	@Override
	public String toString() {
		return "Organization [orgName=" + orgName + ", EmpType=" + EmpType + "]";
	}
	
	
}
