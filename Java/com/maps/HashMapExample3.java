package com.maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter the number of data required");
		int size = objScanner.nextInt();
		Person[] objPersons = new Person[size];
		Employee[] objEmployees = new Employee[size];
		HashMap<Person, Employee> objMap = new HashMap<>();
		for (int i = 0;i<size;i++) {
			System.out.println("Enter name : ");
			String nameString =objScanner.next();
			System.out.println("Enter age : ");
			int age = objScanner.nextInt();
			System.out.println("Enter place : ");
			String placeString = objScanner.next();
			System.out.println("Enter ID");
			int id = objScanner.nextInt();
			objPersons[i] = new Person(nameString,placeString,age,id);
			System.out.println("Enter the jobId for the : ");
			int jobIdInt = objScanner.nextInt();
			System.out.println("Enter the Salary :");
			int salary = objScanner.nextInt();
			System.out.println("Enter the role : ");
			String roleString = objScanner.next();
			System.out.println("Enter the team details : ");
			String teamString = objScanner.next();
			objEmployees[i] = new Employee(jobIdInt, salary, roleString, teamString);
			objMap.put(objPersons[i], objEmployees[i]);
		}
		for(Entry<Person, Employee> entry : objMap.entrySet()) { 
			System.out.println(entry.getKey()+"\n"+entry.getValue()+"\n");
		}
//		System.out.println(Collection<objPersons[1]> values());
		objScanner.close();
	}

}
