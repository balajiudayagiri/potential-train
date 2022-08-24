package com.has_a.details;

public class Person {
	int id,age,pin;
	String name;
	Address address;
	public Person(int id, int age, int pin, String name, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.pin = pin;
		this.name = name;
		this.address = address;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", pin=" + pin + ", name=" + name + "\n Address = " + address + "]";
	}
}
