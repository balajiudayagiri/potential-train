package com.customerdetails;

public class CustomerDetails {

	public static void main(String[] args) {
		CustomerDetailsTemplate objCustomerDetailsTemplate = new CustomerDetailsTemplate();

		objCustomerDetailsTemplate.fName="Jhon";
		objCustomerDetailsTemplate.lName="Bob2";
		objCustomerDetailsTemplate.eMail="jhonbob@mail.com";
		objCustomerDetailsTemplate.Phno=98765432l;
		objCustomerDetailsTemplate.city="london";
		
		objCustomerDetailsTemplate.display();
		System.out.println("________________________________");

		CustomerDetailsTemplate objCustomerDetailsTemplate1 = new CustomerDetailsTemplate();

		objCustomerDetailsTemplate1.fName="Will";
		objCustomerDetailsTemplate1.lName="Smith";
		objCustomerDetailsTemplate1.eMail="willsmith@mail.com";
		objCustomerDetailsTemplate1.Phno=92345677l;                                            
		objCustomerDetailsTemplate1.city="Queens st";
		
		objCustomerDetailsTemplate1.display();
		System.out.println("_________________________________");
	}

}
