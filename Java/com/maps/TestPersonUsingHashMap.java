package com.maps;

import java.util.HashMap;
import java.util.Scanner;

public class TestPersonUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter the number person data space required");
		int num = objScanner.nextInt();
		Person[] objPersons = new Person[num];
		HashMap<Integer,Person> objMap = new HashMap<>();
		
		for (int i = 0;i<num;i++) {
			System.out.println("Enter name : ");
			String nameString =objScanner.next();
			System.out.println("Enter age : ");
			int age = objScanner.nextInt();
			System.out.println("Enter place : ");
			String placeString = objScanner.next();
			System.out.println("Enter ID");
			int id = objScanner.nextInt();
			objPersons[i] = new Person(nameString,placeString,age,id);
			objMap.put(i+1, objPersons[i]);
		}
		for(Integer x : objMap.keySet()) {
//			System.out.println("Person data "+"\n------------"+
//					"\nNAME : "+objMap.get(x).nameString+"\nAge  : "+objMap.get(x).age+
//					"\nPlace: "+objMap.get(x).placeString+"\nId   : "+objMap.get(x).id);
			System.out.println(objMap.get(x).toString());
		}
		objScanner.close();
	}

}
