package com.mindtree.controller;

public class Test {
	
	public static void main(String[] args) 
    { 
Test test=new Test(); 
test.finalize();
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
    } 
  
    // Here overriding finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
    } 
	
}
