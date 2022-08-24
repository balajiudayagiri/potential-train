package com.threads;

class A8 extends Thread{
	@Override
	public void run() {
		Thread objThread = Thread.currentThread();
		System.out.println("the thread at "+objThread.getName()+" is executed :-Example8");
	}
}

public class Example8 {
	public static void main(String[] args) {
		A8 objA8 = new A8();
		objA8.setName("'Thread-1274'");
		objA8.start();
	}
}
