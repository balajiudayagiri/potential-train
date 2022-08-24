package com.abstractclass.one;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we cannot create objects for an abstract class
		//WorldBank class is an abstract so we can't create abstract class
		
//		WorldBank objWorldBank = new WorldBank();
//		objWorldBank.label1();
		
		//we cannot create objects for an abstract class
		//RBI class is an abstract so we can't create abstract class
		
//		RBI objRbi = new RBI();
//		objRbi.label2();
		
		IDFC objIdfc = new IDFC();
		
		objIdfc.taxes();
		objIdfc.account();
		objIdfc.label1();
		System.out.println();
		objIdfc.intrestRates();
		objIdfc.noOfAccunts();
		objIdfc.label2();
		System.out.println();
		objIdfc.label3();
		System.out.println();
		objIdfc.eat();
		objIdfc.fly();
		objIdfc.sound();
			
	}
}
