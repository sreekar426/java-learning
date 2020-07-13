package com.thread;

public interface I {

	void draw();
	
	default void test() {
		System.out.println();
	}
}
