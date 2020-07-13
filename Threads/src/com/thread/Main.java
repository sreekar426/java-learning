package com.thread;

public class Main extends Thread {

	public static void main(String[] args) {

		try {
			System.out.println("Inside Main");
			Thread t1 = Thread.currentThread(); // getting current thread

			System.out.println("Current Thread Name " + t1.getName());
			t1.join();
			System.out.println("Deadloack Thread");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		t1.setName("chukka's thread");    // Setting name to thread
//		
//		System.out.println("Current Thread Name " + t1.getName());
//		
//		System.out.println("Current Thread Name " + t1.getPriority());
//		
//		t1.setPriority(MAX_PRIORITY);
//		
//		System.out.println("Current Thread Name " + t1.getPriority());

		// we can prevent thread executing by following methods
		// yeild,join,sleep

	}

}
