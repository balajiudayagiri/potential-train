package com.methods.carfinalprice;

import java.util.Scanner;

public class TestCarDetails {

	public static void main(String[] args) {
		CarDetails objCarDetails = new CarDetails();
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Enter the Car name : ");
		objCarDetails.name = objScanner.next();//name
		System.out.println("Enter the color ");
		objCarDetails.color = objScanner.next();//color
		System.out.println("Enter the car Breand ");
		objCarDetails.brand = objScanner.next();//brand
		System.out.println("Enter the price of the car : ");
		objCarDetails.price = objScanner.nextDouble();//price
		System.out.println("Enter the discount for the price : ");
		objCarDetails.discount = objScanner.nextInt();//discount
		objScanner.close();
		objCarDetails.finalPrice();
		objCarDetails.display();
	}

}
