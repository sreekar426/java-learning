package com.thread;

public class TestClass {
	public static void main(String[] args) {
		System.out.println(TestClass.getVal(7));
	}
	
	public static Integer getVal(int val) {
		
		if(val<5) {
			return 0;
		}else {
			return null;
		}
	}

}
