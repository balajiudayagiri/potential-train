package com.program18Aug2022;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = " name is Balaji ";
		char []c = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			c[i] = string.charAt(i);
			
		}
		for (int i = 0; i < c.length; i++) { 
			if(string.charAt(i)==' ') 
			c[i] = '_'; 
			System.out.print(c[i]);
		}
	}

}
