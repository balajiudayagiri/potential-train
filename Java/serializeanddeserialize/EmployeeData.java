package com.serializeanddeserialize;

import java.io.Serializable;

public class EmployeeData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3769213853347520070L;
	@SuppressWarnings("unused")
	private String passwordString ="data1234@password"; 
	String firstNameString, lastNameString, currentAddressString, departmentString, roleString;
	Integer age, idNumber, phoneNumber;

	public EmployeeData(String firstNameString, String lastNameString, String currentAddressString,
			String departmentString, String roleString, int age, int idNumber, int phoneNumber) {
		super();
		this.firstNameString = firstNameString;
		this.lastNameString = lastNameString;
		this.currentAddressString = currentAddressString;
		this.departmentString = departmentString;
		this.roleString = roleString;
		this.age = age;
		this.idNumber = idNumber;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstNameString() {
		return firstNameString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public String getCurrentAddressString() {
		return currentAddressString;
	}

	public String getDepartmentString() {
		return departmentString;
	}

	public String getRoleString() {
		return roleString;
	}

	public int getAge() {
		return age;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "EmployeeData\n------------- \nfirstNameString = " + firstNameString + ", lastNameString = " + lastNameString
				+ "\ncurrentAddressString = " + currentAddressString + "\ndepartmentString = " + departmentString
				+ "\nroleString = " + roleString + "\nage = " + age + "\nidNumber = " + idNumber + "\nphoneNumber = "
				+ phoneNumber ;
	}
}
