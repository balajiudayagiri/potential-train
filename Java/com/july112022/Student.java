package com.july112022;

public class Student {
	int id,age,pin;
	String fName,lName,sem,street,city,state,country;
	public Student(int id, int age, int pin, String fName, String lName, String sem, 
			String street, String city,String state, String country) {
		super();
		this.id = id;
		this.age = age;
		this.pin = pin;
		this.fName = fName;
		this.lName = lName;
		this.sem = sem;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Student [ fName=" + fName + ", lName=" + lName+ ",id=" + id + ", age=" + age 
				+  ", sem=" + sem + ", street=" + street + ", city=" + city + ", state=" + state 
				+ ", country=" + country+", pin=" + pin + "]";
	}	
}
