package com.nnn;

public class PersonData {
	String name;
	int age,id,phoneNumber;
	public PersonData(String name, int age, int id, int phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.phoneNumber = phoneNumber;
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "PersonData [name=" + name + ", age=" + age + ", id=" + id + ", phoneNumber=" + phoneNumber + "]";
	}
}
