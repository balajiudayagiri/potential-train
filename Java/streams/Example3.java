package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<Integer> objArrayList = new ArrayList<>();
		objArrayList.add(30);
		objArrayList.add(10);
		objArrayList.add(50);
		objArrayList.add(40);
		objArrayList.add(20);

//		using collectors to collect all the data into an object
		// forEach()
		System.out.println("forEach()");
		List<Integer> objList = objArrayList.stream().collect(Collectors.toList()); 
		System.out.println(objList+"\n");

		// forEach()
		System.out.println("forEach()");
		List<Integer> objList2 = objArrayList.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(objList2+"\n");

		// filter()
		System.out.println("filter()");
		List<Integer> objList3 = objArrayList.stream().filter(i -> i < 35).collect(Collectors.toList());
		System.out.println(objList3+"\n");

		// limit()
		System.out.println("limit()");
		List<Integer> objList4 = objArrayList.stream().limit(4).collect(Collectors.toList());
		System.out.println(objList4+"\n");

		// sorted()
		System.out.println("sorted()");
		List<Integer> objList5 = objArrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(objList5+"\n");

	}
}
