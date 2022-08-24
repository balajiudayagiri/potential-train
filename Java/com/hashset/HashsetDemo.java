package com.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in); 
		HashSet<String> nameSet = new HashSet<>();
		System.out.println("Enter the name and if you want to exit type 'exit' ");
		
		while(true) {
			String nameString = objScanner.next();
			if(nameString.equalsIgnoreCase("exit")) {
				break;
			}
			nameSet.add(nameString);
		}
//_________________________________________________________________________________________________________________		
		//		normally printing the set data
		//		--------------------------------
		System.out.println(nameSet);
//_________________________________________________________________________________________________________________
		//		Iterator
		//		----------
//		JavaBean 8-Features
		Iterator<String> objIterator = nameSet.iterator();
		System.out.println("data using iterator");
		while(objIterator.hasNext()) {
			System.out.println(objIterator.next());
		}
		//		(OR)
		nameSet.iterator().forEachRemaining(System.out::println);
//_________________________________________________________________________________________________________________
		//		enhanced for-loop
		//		------------------
		System.out.println();
		for(Object aObject : nameSet) {
			System.out.println(aObject);
		}
//_________________________________________________________________________________________________________________
		//		Stream
		//		------
		//		Get stream and use lambda expression
		nameSet.stream().forEach(S -> System.out.println(S));
		//		(OR)
		//		by providing method reference
		nameSet.stream().forEach(System.out::println);
		//		(OR)
		//		Stream.of() + toArray()
		Stream.of(nameSet.toArray()).forEach(System.out::println);
		//		(OR)
		//		Stream.of() + toString()
		Stream.of(nameSet.toArray()).forEach(System.out::println);
//_________________________________________________________________________________________________________________
		//		Set inherit `forEach()` from `java.lang.Iterable` interface
		//		             ----------
		nameSet.forEach(System.out::println);
		objScanner.close();
	}

}
