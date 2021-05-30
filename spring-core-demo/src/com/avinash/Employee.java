package com.avinash;

public class Employee {

	int eid;
	String ename;
	Address address;
	
	public Employee() {
		
	}
	
	public Employee(Address adrs) {
		this.address = adrs;
	}
	
	public Employee(int eid, String ename, Address address) {
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	
	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void myInit() {
		System.out.println("--Object Instanciated--");
	}
	public void myDestroy() {
		System.out.println("--Object Destroyed--");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}
	
	
	
}
