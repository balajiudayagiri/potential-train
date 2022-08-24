package com.queue.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ExamplePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> integers = new PriorityQueue<>(Comparator.reverseOrder());
		integers.add(5);
		integers.add(3);
		integers.add(1);
		integers.add(4);
		integers.add(0);
		integers.add(2);
		System.out.println("to get data in descending order by using max heap order\n"+integers+"\n");
		PriorityQueue<Integer> integers1 = new PriorityQueue<>();
		integers1.add(5);
		integers1.add(3);
		integers1.add(1);
		integers1.add(4);
		integers1.add(0);
		integers1.add(2);
		System.out.println("to get data in ascending order by using min heap order\n"+integers1);
	}

}
