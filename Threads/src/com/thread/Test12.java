package com.thread;

public class Test12 {
	
	Test12(int a,int b){
		System.out.println("int..."+a+b);
	}
	
	Test12(Integer a,Integer b){
		System.out.println("Integer..."+a+b);
	}
	
	public static void main(String[] args) {
		
		
		int age = 10;
		int myAge = 30;
		char c = (char) age;
		//char b = '9';
		System.out.println(c);
		//Test12 te=new Test12(new Integer(12), new Integer(13));
	}

}
