package com.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class List1000 {

	public static void main(String[] args) {

		List<Integer> lines = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<String, Integer> myMap = new LinkedHashMap<>();
		myMap.put("kiran", 5);
		myMap.put("sreekar", 40);
		myMap.put("taleev", 80);
		myMap.put("bala", 30);
		myMap.put("sravya", 10);

		Set<Entry<String, Integer>> set = myMap.entrySet();

		List<Entry<String, Integer>> ls = new ArrayList<Entry<String, Integer>>(set);

		Collections.sort(ls, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		for (Entry<String, Integer> entry : ls) {
			
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}

		List<Integer> subList = lines.subList(4, 8);
		
		// System.out.println(subList);

		List<Integer> result = lines.stream().filter(line -> line > 5).collect(Collectors.toList());

		// result.forEach(System.out::println);

	}

}
