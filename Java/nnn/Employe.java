package com.nnn;

public class Employe extends Person {
	
	int pfno;
	
	public Employe(int id, int age, String name, String collegename, int pfno) {
		
		super(id,age,name,collegename);
		this.pfno = pfno;
		
	}
	
	public void display1() {
		System.out.println(pfno);
	}

	public int getPfno() {
		return pfno;
	}

	public void setPfno(int pfno) {
		this.pfno = pfno;
	}

}
