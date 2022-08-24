package com.threads;

class AAA extends Thread{
	public AAA() {
		super();
	}
	public AAA(String name) {
		super(name);
	}
	@Override
	public void run() {
		Thread objThread = Thread.currentThread();
		System.out.println("the thread at "+objThread.getName()+" is executed :-Example7");
	}
}

public class Example7 {

	public static void main(String[] args) {
		AAA objAaa = new AAA("'Thread-1274'");
		objAaa.start();
	}

}
