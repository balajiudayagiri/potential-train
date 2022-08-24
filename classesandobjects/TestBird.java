package com.classesandobjects;

import java.util.Scanner;

public class TestBird {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		BirdClass objBirdClass = new BirdClass();
		
		//here the object is just used to assigne the values to the 
		//variable according to the given data in class BirdClass
		System.out.println("Enter the Height : ");
		objBirdClass.height=objScanner.nextDouble();
		System.out.println("Enter the no.of legs : ");
		objBirdClass.legs=objScanner.nextInt();
		System.out.println("Enter the name : ");
		objBirdClass.name=objScanner.next();
		
		objBirdClass.action();
		
		objScanner.close();
	}

}
