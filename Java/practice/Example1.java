package com.practice;

import java.util.HashMap;
import java.util.Scanner;

import com.streams.EmployeeData;

public class Example1 {
	static HashMap<Integer, EmployeeData> objMap;

	public static void dataEntery() {
		objMap = new HashMap<>();
		Scanner objScanner = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			System.out.println("enter the id number");
			Integer idInteger = objScanner.nextInt();
			if (idInteger==0) {
				System.out.println("data entry mode closed");
				
				break;
			}
				System.out.println("Enter your First Name : ");
				String fnameString = objScanner.next();
				System.out.println("Enter your Last Name : ");
				String lnameString = objScanner.next();
				System.out.println("enter the address : ");
				String addressString = objScanner.next();
				System.out.println("enter your age : ");
				int age = objScanner.nextInt();
				System.out.println("enter your phone number : ");
				int phonenumber = objScanner.nextInt();
				objMap.put(idInteger, new EmployeeData(fnameString, lnameString, addressString, age, phonenumber));
				System.out.println("*---------------------------*"
						          +"\n|data at id number "+idInteger+" saved|"
						          +"\n*---------------------------*");
				System.out.println("To enter another data enter the id number \n if you want to end this enter 0");
		}
		objScanner.close();
	}

	public static void main(String[] args) {
		dataEntery();
	}
}
