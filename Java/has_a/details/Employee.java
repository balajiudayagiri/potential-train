package com.has_a.details;

public class Employee {
	int id,pNo,pPNo,pin;
	String fName,lName;
	Address permanentAddress,presentAddress,officeAddress;
	public Employee(int id, int pNo, int pPNo, int pin, String fName, String lName, Address permanentAddress,
			Address presentAddress, Address officeAddress) {
		super();
		this.id = id;
		this.pNo = pNo;
		this.pPNo = pPNo;
		this.pin = pin;
		this.fName = fName;
		this.lName = lName;
		this.permanentAddress = permanentAddress;
		this.presentAddress = presentAddress;
		this.officeAddress = officeAddress;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", pNo=" + pNo + ", pPNo=" + pPNo + ", pin=" + pin + ", fName=" + fName
				+ ", lName=" + lName + "\n PermanentAddress = " + permanentAddress + "\n PresentAddress = " + presentAddress
				+ "\n OfficeAddress = " + officeAddress + "]";
	}
	

}
