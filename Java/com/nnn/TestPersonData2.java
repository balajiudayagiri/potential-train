package com.nnn;

import javax.swing.JOptionPane;

public class TestPersonData2 {
	static String a;
	static int b,c,d;
	public static void main(String[] args) {
		PersonData2[] objPersonData2 = new PersonData2[2];
		for(int i=0; i<objPersonData2.length;i++) {
			a = JOptionPane.showInputDialog("Enter name");
			b = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Enter id"));
			d = Integer.parseInt(JOptionPane.showInputDialog("Enter phoneNumber"));
			objPersonData2[i] = new PersonData2();
			objPersonData2[i].setName(a);
			objPersonData2[i].setAge(b);
			objPersonData2[i].setId(c);
			objPersonData2[i].setPhoneNumber(d);
		}
		for(int i=0; i<objPersonData2.length;i++) {
			System.out.println(objPersonData2[i].getName());
			System.out.println(objPersonData2[i].getAge());
			System.out.println(objPersonData2[i].getId());
			System.out.println(objPersonData2[i].getPhoneNumber());
		}
		
	}

}
