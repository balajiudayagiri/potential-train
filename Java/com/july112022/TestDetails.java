package com.july112022;

public class TestDetails {

	public static void main(String[] args) {
		System.out.println("Person Data\n----------------");
		@SuppressWarnings("unused")
		Person objPerson = new Person(20221, 21, 560001, "PersonA", "StreetA", "CityA", "StateA", "CountryA");
		System.out.println();
		System.out.println("Student Data\n---------------");
		@SuppressWarnings("unused")
		Student objStudent = new Student(20222, 20, 560002,"FirstName" , "LastName", "6th", "StreetB", "CityB", "StateB", "CountryB");
		System.out.println();
		System.out.println("Employee Data\n-----------------");
		Employee objEmployee = new Employee(20223, 987654321, 123456789, "FirstName", "LastName");
		objEmployee.addressPermanant("EastStreet", "EastCity", "EastState", "EastCountry", 560004);
		objEmployee.addressPresent("WestStreet", "WestCity", "WestState", "WestCountry", 660004);
		objEmployee.addressOffice("NorthStreet", "NorthCity", "NorthState", "NorthCountry", 880044);
		System.out.println();
	}
}
