package com.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestList {

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		s.setId(2);
		s.setName("Sreekar");
		s1.setId(4);
		s1.setName("Kiran");
		s2.setId(9);
		s2.setName("Sai");
	
		
		Set<Student> myList = new TreeSet<>();
		myList.add(s);
		myList.add(s1);
		myList.add(s2);

		/*Collections.sort(myList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getId() > o2.getId()) {
					return -1;
				} else {
					return 1;
				}

			}

		});
		
		
		for (Student student : myList) {
			System.out.println(student.getId()+"---->"+student.getName());
		}*/
		
		//Collections.sort(myList);
		
		for (Student student : myList) {
			System.out.println(student.getId()+"-->"+student.getName());
			
		}
	}

}
