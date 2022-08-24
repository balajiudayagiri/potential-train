package com.classesandobjects;

import java.util.Scanner;

public class TestBird3 {

	public static void main(String[] args) {
		BirdClass objBirdClass = new BirdClass();
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Enter the height : ");
		objBirdClass.height = objScanner.nextDouble();
		System.out.println("Enter the no.of legs : ");
		objBirdClass.legs = objScanner.nextInt();
		System.out.println("Enter the name : ");
		objBirdClass.name = objScanner.next();
		
		
		BirdClass objBirdClass2 = new BirdClass();
		
		System.out.println("Enter the height : ");
		objBirdClass2.height = objScanner.nextDouble();
		System.out.println("Enter the no.of legs : ");
		objBirdClass2.legs = objScanner.nextInt();
		System.out.println("Enter the name : ");
		objBirdClass2.name = objScanner.next();
		
		objBirdClass.action();
		objBirdClass2.action();
		
		objScanner.close();
	}

}
