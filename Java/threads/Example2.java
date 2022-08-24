package com.threads;

public class Example2 implements Runnable {
	@Override
	public void run() {
		System.out.println("thread is running........Example2");
	}

	public static void main(String[] args) {
		Example2 objExample2 = new Example2();
		Thread objThread = new Thread(objExample2);
		objThread.start();
	}

}
