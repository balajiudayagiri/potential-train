package com.customerdetails;

import java.util.Scanner;

public class CustomerDetailsInputs {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		CustomerDetailsTemplate objCustomerDetailsTemplate = new CustomerDetailsTemplate();
		
		System.out.println("Enter the First name : ");
		objCustomerDetailsTemplate.fName=objScanner.next();
		System.out.println("Enter the Last Name : ");
		objCustomerDetailsTemplate.lName=objScanner.next();
		System.out.println("Enter the E-mail : ");
		objCustomerDetailsTemplate.eMail=objScanner.next();
		System.out.println("Enter the City name : ");
		objCustomerDetailsTemplate.city=objScanner.next();
		System.out.println("Enter the phone Number : ");
		objCustomerDetailsTemplate.Phno=objScanner.nextLong();
		
//		'objCustomerDetailsTemplate' contains the data from the console and now it is stored inside 'custObj'

		CustomerDetailsTemplate custObj = objCustomerDetailsTemplate;
		
		System.out.println("\n============================\nCustomer Details Updated\n*************************");
		custObj.display();
		objScanner.close();
	}

}
