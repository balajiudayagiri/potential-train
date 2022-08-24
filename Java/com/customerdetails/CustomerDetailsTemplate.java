package com.customerdetails;

public class CustomerDetailsTemplate {

	String fName,lName,eMail,city;
	long Phno;

	public void display() {
		System.out.println("Name : "+fName+" "+lName+"\nContact Details\nE-mail : "+eMail
				+"\nPhone Number :"+Phno+"\nCity : "+city);
	}


}
