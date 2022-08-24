package com.polymorphism.overring;

public class TestClass {

	public static void main(String[] args) {
		RBI objRbi = new RBI();//create obj for parent and refer by parent class
		objRbi.account();
		objRbi.intrestRate();
		System.out.println();
		
		IDFC objIdfc = new IDFC();//create obj for child and refer by child class
		objIdfc.account();
		objIdfc.intrestRate();
		objIdfc.minimumBalance();
		System.out.println();
		
		RBI objRbi2 = new IDFC(); //create obj for child and refer by parent class
		objRbi2.account();
		objRbi2.intrestRate();
		System.out.println();
			
		RBI rbi = new IDFC();//create obj for child and refer by parent class
		IDFC i = (IDFC)rbi;//Performing Downcasting Explicitly  
		i.account();
		i.intrestRate();
		i.minimumBalance();
		
		

	}

}
