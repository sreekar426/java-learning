package com.thread;

public class myIThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName());
		}
	}

}
class TestIThread{
	public static void main(String[] args) {
		
		myIThread myThread=new myIThread();
		Thread th=new Thread(myThread);
		th.start();
	}
}
