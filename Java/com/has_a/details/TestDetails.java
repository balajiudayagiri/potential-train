package com.has_a.details;

public class TestDetails {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Address objPersonAddress = new Address("BhoomiReddy Colony", "Benglore", "Karnataka", "India");
		
		System.out.println("Person Data\n----------------");
		Person objPerson = new Person(20221, 25, 560001, "Balaji",objPersonAddress);
		System.out.println();
		
		Address objStudentAddress = new Address("RangaReddy colony", "Guntur", "Andhra Pradesh", "India");
		
		System.out.println("Student Data\n---------------");
		Student objStudent = new Student(20222, 21, 560002, "Krishna", "Udayagiri", "6th",objStudentAddress);
		System.out.println();
		
		Address objEmployeeParmenentAddress = new Address("Geethanjali Layout", "Benglore", "Karnataka", "India");
		Address objEmployeePresentAddress = new Address("St.Louis Street", "LosAngulos", "Manhatan", "United States Of Amarica");
		Address objEmployeeOfficeAddress = new Address("St.Bostan Street", "London", "London", "England");
		
		System.out.println("Employee Data\n-----------------");
		Employee objEmployee = new Employee(20223, 123456789, 112233445, 560003, "Rajesh", "Udayagiri"
									,objEmployeePresentAddress,objEmployeeParmenentAddress,objEmployeeOfficeAddress);

		
		

	}

}
