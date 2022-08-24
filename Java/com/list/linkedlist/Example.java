package com.list.linkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numberArrayList = new ArrayList<>();
		numberArrayList.add(90);
		numberArrayList.add(100);
		numberArrayList.add(70);
		numberArrayList.add(60);
		numberArrayList.add(80);
		System.out.println("Arraylist : "+numberArrayList);
		long startTime = System.nanoTime();
		numberArrayList.sort(Comparator.naturalOrder());
		long stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
		System.out.println("Arraylist : "+numberArrayList);
		System.out.println();
		LinkedList<Integer> numberLinkedList = new LinkedList<>();
		numberLinkedList.add(50);
		numberLinkedList.add(20);
		numberLinkedList.add(40);
		numberLinkedList.add(30);
		numberLinkedList.add(10);
		System.out.println("LinkedList : "+numberLinkedList);
		long startTime1 = System.nanoTime();
		numberLinkedList.sort(Comparator.naturalOrder());
		long stopTime1 = System.nanoTime();
		System.out.println(stopTime1 - startTime1);
		System.out.println("LinkedList : "+numberLinkedList);
		System.out.println();
	}

}
