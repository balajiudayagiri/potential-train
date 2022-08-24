package com.streams;

import java.util.ArrayList;
import java.util.Comparator;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> objArrayList = new ArrayList<>();
		objArrayList.add(30);
		objArrayList.add(10);
		objArrayList.add(50);
		objArrayList.add(40);
		objArrayList.add(20);

//		using foreach to print all the outputs

//		forEach()
		System.out.println("forEach()");
		objArrayList.stream().forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

//		forEach()
		System.out.println("forEach()");
		objArrayList.stream().map(i -> i + 5).forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

//		filter()
		System.out.println("filter()");
		objArrayList.stream().filter(i -> i < 35).forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

//		limit()
		System.out.println("limit()");
		objArrayList.stream().limit(4).forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

//		sorted()
		System.out.println("sorted()");
		objArrayList.stream().sorted().forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

//		we can also customize the sorting order
		objArrayList.stream().sorted((a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0).forEach(S -> System.out.print(S + " "));
		System.out.println("\n");
//		also
		objArrayList.stream().sorted((a, b) -> -a.compareTo(b)).forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

//		count()
		System.out.println("count()");
		long count = objArrayList.stream().count();
		System.out.println(count);
		System.out.println("\n");

		objArrayList.stream().distinct().forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

		Integer minValue = objArrayList.stream().min((a, b) -> a.compareTo(b)).get();
		Integer maxValue = objArrayList.stream().max((a, b) -> a.compareTo(b)).get();
		System.out.println(minValue + "\n" + maxValue);
		System.out.println("\n");

		Integer minValue1 = objArrayList.stream().min((a, b) -> -a.compareTo(b)).get(),
				maxValue1 = objArrayList.stream().max((a, b) -> -a.compareTo(b)).get();
		System.out.println(minValue1 + "\n" + maxValue1);

		objArrayList.stream().skip(1).forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

		objArrayList.stream().distinct().forEach(S -> System.out.print(S + " "));
		System.out.println("\n");

		Integer num = objArrayList.stream().reduce((a, b) -> a+b).get();
		System.out.println(num);

	}
}
