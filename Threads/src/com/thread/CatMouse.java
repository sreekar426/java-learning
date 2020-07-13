package com.thread;

public class CatMouse {
	
	public static void main(String[] args) {
		System.out.println(catAndMouse(33 ,86, 59));
	}
	private static String catAndMouse(int x, int y, int z) {
		
		int catA=x-z;
		int catB=y-z;
		
		if(catA<catB) {
			return "Cat A";
		}else if((catA+catB)==0 || (catA+catB)==1)
		{
			return"Mouse";
		}else {
			return"Cat B";
		}
		
		
	}
	
}
