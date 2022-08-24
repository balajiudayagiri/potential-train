package com.has_a.details;

public class Student {
	int id,age,pin;
	String fName,lName,sem;
	Address address;
	public Student(int id, int age, int pin, String fName, String lName, String sem, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.pin = pin;
		this.fName = fName;
		this.lName = lName;
		this.sem = sem;
		this.address = address;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", pin=" + pin + ", fName=" + fName + ", lName=" + lName
				+ ", sem=" + sem + "\n Address = " + address + "]";
	}
	
	
}
