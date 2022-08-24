package com.streams;

public class EmployeeData {
	String firstName;
	String lastName;
	String address;
	int age;
	int phoneNumber;
	public EmployeeData(String firstName, String lastName, String address, int age, int phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "EmployeeData [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", age="
				+ age + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
