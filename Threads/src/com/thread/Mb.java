package com.thread;

public class Mb {

	public static void main(String[] args) {
		
		String documentSize="2000";
		int test=2000000;
		
		int test1=Integer.parseInt(documentSize);
		System.out.println(mbConverter(test));
		System.out.println(mbConverter(test1));

	}

	private static long mbConverter(int request) {
		return request / (1024 * 1024);
	}
}
