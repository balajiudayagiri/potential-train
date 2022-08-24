package com.july112022;

public class Person {
	int id,age,pin;
	String name,street,city,state,country;
	public Person(int id, int age, int pin, String name, String street,
			String city, String state, String country) {
		super();
		this.id = id;
		this.age = age;
		this.pin = pin;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Person [ name=" + name + ", id=" + id + ", age=" + age +  ", street=" + street
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
}
