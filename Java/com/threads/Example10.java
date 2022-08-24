package com.threads;

class A10 implements Runnable{

	@Override
	public void run() {
		Thread objThread = Thread.currentThread();
		System.out.println("the thread at " + objThread.getName() + " is executed :-Example10");
	}
	
}

public class Example10 {

	public static void main(String[] args) {
		A10 objA10 = new A10();
		Thread objThread = new Thread(objA10);
		objThread.setName("'Thread-1274'");
		objThread.start();
	}

}
