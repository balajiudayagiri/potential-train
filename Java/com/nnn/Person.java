package com.nnn;

public class Person {
	
	int id;
	int age;
	String name;
	static String collegename;
	
	@SuppressWarnings("static-access")
	public Person(int id, int age, String name, String collegename) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.collegename = collegename;
		
		
	}
	
	
	


	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static String getCollegename() {
		return collegename;
	}


	public static void setCollegename(String collegename) {
		Person.collegename = collegename;
	}
	

}
