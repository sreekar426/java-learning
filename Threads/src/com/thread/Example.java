package com.thread;

public class Example {

	public static void main(String[] args) {
		b cls=(b) new a();
	}
}

class a {
	void print() {
		System.out.println("Hiii..A");
	}
}

class b extends a {

	void print() {
		System.out.println("Hiii");
	}
}
