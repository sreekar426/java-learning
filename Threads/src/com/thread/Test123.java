package com.thread;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeMap;
import java.util.TreeSet;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test123 {
	
	public static void main(String[] args) {
		
		List<Student> myList=new LinkedList<Student>();
		
		Map<String,String> map=new TreeMap<>()<>();
		
		Student s=new Student();
		s.setId(3);
		s.setName("Sreekar");
		Student s1=new Student();
		s1.setId(2);
		s1.setName("Himaja");
		Student s2=new Student();
		s2.setId(1);
		s2.setName("Taleev");
		myList.add(s);
		myList.add(s1);
		myList.add(s2);
	
		
		IntStream lst=IntStream.of(1,3,-1,-3,4,6,7,-10);
		OptionalInt te=lst.min();
		System.out.println(te.getAsInt());
		
		IntStream lstt=IntStream.range(50, 75);
		//int num=lstt.min().orElse(-1);
		int num1=lstt.max().orElse(-1);
		//System.out.println(num);
		System.out.println(num1);
		
	
		Collections.sort(myList,(o1,o2)->(o1.getId()>o2.getId())?-1:(o1.getId()<o2.getId())?1:0);
		
		myList.forEach(p->System.out.println(p.getName()));
	}

}
