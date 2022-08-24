package com.stringmethodsexamples;

public class CodePointAt {

	public static void main(String[] args) {
		String city = "Benglore", nameString= "Balaji";


		System.out.println(nameString.codePointAt(2)); // returns the ASCII code of charector

		System.out.println(nameString.concat(city)); //joins the two Strings

		System.out.println(city.length());//returns the no.of charectors

		System.out.println(city.replace(city, nameString)); //now city = "Balaji"

	}

}
