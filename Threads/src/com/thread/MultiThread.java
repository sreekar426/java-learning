package com.thread;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {

		Even even = new Even();
		Thread evenThread = new Thread(even);
		Odd odd = new Odd();
		Thread oddThread = new Thread(odd);
		evenThread.start();
		 evenThread.sleep(100);
		oddThread.start();
		// oddThread.sleep(2000);
	}

}

class Even implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 11; i += 2) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Even Numbers" + i);
		}
	}

}

class Odd implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 11; i += 2) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Odd Numbers" + i);
		}

	}

}
