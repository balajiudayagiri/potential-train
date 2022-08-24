package com.list.arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//import java.util.Collections;

public class Assignment1 {

	public static void main(String[] args) {
		List<String> inputList = Arrays.asList("java", "php", "android", "sap", 
				"php", "java", "win", "ios", "win", "hana",
				"android","ios","ios");
		System.out.println("ArrayConvertedToList : \n"+inputList+"\n");
		HashSet<String> inputSet = new HashSet<>(inputList);
		// we have passed the list into hashSet constructor so this hashSet will be created by 
		System.out.println("ArrayList to HashSet to avoid duplicates : \n"+inputSet+"\n");
		//a set with no duplicates will loop through this for-each 
		for(String string : inputSet) {
			int count=0;
				//a list with duplicates will loop through this for-each 
				for (String objString : inputList)
					if (string.contains(objString))
						count++;
			System.out.println(string+" times "+count);
			//			System.out.println(string+" times "+Collections.frequency(inputList, string)); 
		}													//using this frequency() we are giving comparetive to comparator	
	}
}
