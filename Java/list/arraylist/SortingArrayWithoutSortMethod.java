package com.list.arraylist;

import java.util.ArrayList;

public class SortingArrayWithoutSortMethod {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		numbers.add(60);
		numbers.add(10);
		numbers.add(50);
		System.out.println("Befor sorting");
		System.out.println(numbers);
		for(int i=0;i<numbers.size();i++) {
//			for(int j=0;j<i;j++) { -> if we do it like this we will get descending order
			for(int j=numbers.size()-1;j>i;j--) { // -> this will give ascending order
//				to get each element individually we need a method that is 'get()'
				if(numbers.get(i)>numbers.get(j)) {
					Integer temp = 0;
					temp = numbers.get(i);
//			***The left-hand side of an assignment must be a variable***
//					numbers.get(i) = numbers.get(j);
//					numbers.get(j) = temp;
//					we cannot use this process so we use set method for data position changing 
					numbers.set(i,numbers.get(j));
					numbers.set(j,temp);
				}
			}
		}
		System.out.println("After sorting ");
		System.out.println(numbers);		
	}
}
