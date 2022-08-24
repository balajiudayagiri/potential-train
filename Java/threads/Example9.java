package com.threads;

class A9 implements Runnable {

	@Override
	public void run() {
		Thread objThread = Thread.currentThread();
		System.out.println("the thread at " + objThread.getName() + " is executed :-Example9");
	}

}

public class Example9 {

	public static void main(String[] args) {
		A9 objA9 = new A9();
		Thread objThread = new Thread(objA9,"'Thread-1274'");
		objThread.start();
	}

}
