package com.thread;

public class MyThread extends Thread{
	
	public MyThread(String name)
    {
        super(name);
    }
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Before Sleeping");
			 
	        try
	        {
	        	sleep(5000);       //main thread is going for sleep not My Thread
	        }
	        catch (InterruptedException e)
	        {
	            e.printStackTrace();
	        }
	 
	        System.out.println("After Sleeping");
		}
	}

}

class TestThread{
	public static void main(String[] args) {
		
		MyThread myThread=new MyThread("my thread");
		myThread.start();
		
		
    }
	
}
