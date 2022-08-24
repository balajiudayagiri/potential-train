package com.inheritance.hiracial;

public class Employee extends Person {
	int pf, pan;

	public Employee(int id, int age, int pin, String name, Address address, int pf, int pan) {
		super(id, age, pin, name, address);
		this.pf = pf;
		this.pan = pan;
	}
	
	public int getPf() {
		return pf;
	}

	public void setPf(int pf) {
		this.pf = pf;
	}

	public int getPan() {
		return pan;
	}

	public void setPan(int pan) {
		this.pan = pan;
	}
	
}
