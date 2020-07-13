package com.thread;

class TestJoinMethod1 extends Thread {
	
	TestJoinMethod1(String threadname, ThreadGroup tgob) {
		super(tgob, threadname);
		start();
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" current thread "+i);
		}
	}

	public static void main(String args[]) {
		ThreadGroup group = new ThreadGroup("Sreekar");
		TestJoinMethod1 t1 = new TestJoinMethod1("one",group);
		TestJoinMethod1 t2 = new TestJoinMethod1("two",group);
		TestJoinMethod1 t3 = new TestJoinMethod1("three",group);
		
		
		
		
		
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
		
		System.out.println(group.activeCount());
	}
}