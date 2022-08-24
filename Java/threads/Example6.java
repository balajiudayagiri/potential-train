package com.threads;

class AA implements Runnable{
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

class BB implements Runnable{
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

public class Example6 {
	public static void main(String[] args) {
		AA objAa = new AA();
		BB objBb = new BB();
		
		Thread objThread1 = new Thread(objAa);
		Thread objThread2 = new Thread(objBb);
		
		objThread1.start();
		objThread2.start();
		
	}

}
