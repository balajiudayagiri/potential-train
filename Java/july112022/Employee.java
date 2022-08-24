package com.july112022;

public class Employee {
	int id,pNo,pPNo,pin;
	String fName,lName,address,street , city , state , country;
	public void addressPermanant(String street,String  city ,String state ,String country ,int pin) {
		System.out.println("Permanant address [Street="+street +", City="+ city +", State="+ state +", Country="+ country +", Pin="+ pin+"]");
	}
	public void addressPresent(String street,String  city ,String state ,String country ,int pin) {
		System.out.println("Present address [Street="+street +", City="+ city +", State="+ state +", Country="+ country +", Pin="+ pin+"]");
	}
	public void addressOffice(String street,String  city ,String state ,String country ,int pin) {
		System.out.println("Office address [Street="+street +", City="+ city +", State="+ state +", Country="+ country +", Pin="+ pin+"]");
	}
	public Employee(int id, int pNo, int pPNo, String fName, String lName) {
		super();
		this.id = id;
		this.pNo = pNo;
		this.pPNo = pPNo;
		this.fName = fName;
		this.lName = lName;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", pNo=" + pNo + ", pPNo=" + pPNo + ", fName=" + fName + ", lName=" + lName + "]";
	}
	




}
