package com.nnn;

public class TestData {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person(18, 28, "vamsy krishna","sathyabama");
		
//		p.display();
		
		Employe e = new Employe(16, 30, "riyan", "srm", 1566);
		
		e.setId(15);
		e.setAge(27);
		e.setName("javeed");
		e.setPfno(2677);
		e.setCollegename("vit");
		
		System.out.println(e.getAge());
		
		e.setId(34);
		e.setAge(54);
		e.setName("harsha");
		e.setPfno(5666);
		e.setCollegename("vit");
		
		System.out.println(e.getAge());
		
//		e.display();
		e.display1();
			
		

	}

}

