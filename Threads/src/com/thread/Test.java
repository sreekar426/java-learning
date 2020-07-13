package com.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
//	int inputArray [] = {1,2,4,2,1,3,5,6,6};
//		
//     Set<Integer> uniqueElements=new HashSet<>();
//     
//   
//		Set<Integer> duplicate = Arrays.stream(inputArray)
//                .filter(i -> !uniqueElements.add(i))
//                .boxed()
//                .collect(Collectors.toSet());
//		
//		System.out.println(duplicate);
		
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "Sree1");
		mp.put(2, "Sree2");
		mp.put(3, "Sree3");
		mp.put(5, "Sree4");
		Set<?> set=mp.keySet();
		
		for (Object result : set) {
			//System.out.println(string);
			System.out.println(mp.get(result));
		}
		
		for (Map.Entry<Integer, String> result : mp.entrySet()) {
			
			//System.out.println(result.getKey()+"..."+result.getValue());
		}
	}

}
