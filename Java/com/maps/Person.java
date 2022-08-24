package com.maps;

import java.util.Objects;

public class Person {
	String nameString,placeString;
	int age,id;
	public Person(String nameString, String placeString, int age, int id) {
		super();
		this.nameString = nameString;
		this.placeString = placeString;
		this.age = age;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, nameString, placeString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		return age == other.age && id == other.id && Objects.equals(nameString, other.nameString)
				&& Objects.equals(placeString, other.placeString);
	}

	public String toString() {
		return "Person data "+"\n------------"+
				"\nNAME : "+nameString+"\nAge  : "+age+
				"\nPlace: "+placeString+"\nId   : "+id;
	}
	
}
