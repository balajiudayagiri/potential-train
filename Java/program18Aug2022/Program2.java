package com.program18Aug2022;

import java.util.LinkedHashSet;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Character> objHashSet = new LinkedHashSet<>();
		A a = () ->{
			String string = "UdayagiriBalaji";
			
			char c[] = new char[string.length()];
			for (int i = 0; i < string.length(); i++) {
				c[i] = string.charAt(i);
				objHashSet.add(string.charAt(i));
			}
			
			for (Character character : objHashSet) {
				int count = 0;
				for (int i = 0; i < c.length; i++) 
					if (character==c[i]) count++;
				System.out.println(character +" => "+count);
			}
		};
		a.getNoOfOccurence();
	}

}

