package com.inheritance.hiracial;

public class TestClass {

	public static void main(String[] args) {
		Address objAddress = new Address("North Street", "North City", "North State", "North Country", 123456);
		Person objPerson = new Person(123, 25, 654321, "NAME", objAddress);
		
		System.out.println(objPerson.getId());
		System.out.println(objPerson.getAge());
		System.out.println(objPerson.getPin());
		System.out.println(objPerson.getName());
		System.out.println(objPerson.getAddress().getCity());
		System.out.println(objPerson.getAddress().getCountry());
		System.out.println(objPerson.getAddress().getStreet());
		System.out.println(objPerson.getAddress().getState());
	}

}
