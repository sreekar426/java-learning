package com.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(1);
pickingNumbers(a);
	}

	public static int pickingNumbers(List<Integer> a) {
		List<Integer> a1=new ArrayList<>();
		Collections.sort(a);
		
		for(int i=0;i<a.size();i++) {
			for(int j=i+1;j<a.size();j++) {
			int first=a.get(i);
			int second=a.get(i+1);
			if(second-first==1 || second-first==0) {
				a1.add(a.get(i));
			}
			}
		}
		for (Integer integer : a1) {
			System.out.println(integer);
		}
		return 0;

	}
}
