package com.threads;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) throws InterruptedException {
		Person objPerson = new Person(5);
		System.out.println("initial count " + objPerson.count);
		
		List<Thread> objList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			Thread objThread = new MyThread(objPerson);
			objThread.start();
			objList.add(objThread);
		}
		for (Thread thread : objList) {
			thread.join();
		}
		System.out.println("data : "+objPerson.count);
	}

}
