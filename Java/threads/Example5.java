package com.threads;

class A extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Class - A");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Class - B");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Example5 {

	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		objA.start();
		objB.start();
	}

}
