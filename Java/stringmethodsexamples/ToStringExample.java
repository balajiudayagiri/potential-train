package com.stringmethodsexamples;

public class ToStringExample {
	
	String name, city;
	int age;
	
	public ToStringExample(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "StringExample [name=" + name + ", city=" + city + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		ToStringExample objStringExample = new ToStringExample("balaji","benglore",25);
		System.out.println(objStringExample);

	} 

}
