package com.queue;

import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> deque = new ArrayDeque<String>(); 
		deque.offerLast("A");
		deque.add("HELLO");
		deque.offerFirst("B");
		deque.offerFirst("C");
		for (String string : deque) {
			System.out.println(string);
		}
	}

}
