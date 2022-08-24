package com.classesandobjects;

public class TestBird1 {

	public static void main(String[] args) {
		BirdClass objBirdClass = new BirdClass();
		
		objBirdClass.height=303.3;
		objBirdClass.legs=2;
		objBirdClass.name="Eagle";
		
		System.out.println(objBirdClass.height);
		System.out.println(objBirdClass.legs);
		System.out.println(objBirdClass.name);
		
		objBirdClass.action();
		
		BirdClass objBirdClass2 = new BirdClass();
		
		objBirdClass2.height=404.4;
		objBirdClass2.legs=4;
		objBirdClass2.name="Oustrich";
		
		System.out.println(objBirdClass2.height);
		System.out.println(objBirdClass2.legs);
		System.out.println(objBirdClass2.name);
		
		System.out.println(objBirdClass.height);
		System.out.println(objBirdClass.legs);
		System.out.println(objBirdClass.name);
		
		objBirdClass2.action();
		
		
	}

}
