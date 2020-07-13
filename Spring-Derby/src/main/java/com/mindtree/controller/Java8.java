package com.mindtree.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {

		List<Integer> myNumberList = Arrays.asList(1, 2, 3, 4, 5);
		List<String> myList = Arrays.asList("Sreekar", "Taleev", "Karthik", "Bala", "Ragul", "Suresh", "Taleev");

		// findFirst() gives optional list <?>
		// Returns first element if found

		Optional<String> findFirst = myList.stream().filter(i -> i.contains("a")).findFirst();
		if (findFirst.isPresent()) {
			System.out.println("find First Name =" + findFirst.get());
		} else {
			System.out.println("No Records Found");
		}

		// findAny() gives optional list <?>
		// Returns first element if found
		Optional<String> findAny = myList.stream().filter(i -> i.contains("al")).findAny();
		if (findAny.isPresent()) {
			System.out.println("find Any Name =" + findAny.get());
		} else {
			System.out.println("No Records Found");
		}

		// anyMatch()
		// Will return boolean true/false based on the match found
		boolean findAnyMatch = myNumberList.stream().anyMatch(i -> i == 4);
		System.out.println("find Any Match==> " + findAnyMatch);

		// allMatch()
		// Will return boolean true/false based on the match found
		boolean findAllMatch = myNumberList.stream().allMatch(i -> i < 10);
		System.out.println("find All Match==> " + findAllMatch);

		// allMatch()
		// Will return boolean true/false based on the match found
		boolean findNoMatch = myNumberList.stream().noneMatch(i -> i == 10);
		System.out.println("find No Match==> " + findNoMatch);

		// Collecting collections as list
		List<String> filterList = myList.stream().filter(i -> i.startsWith("T")).collect(Collectors.toList());
		System.out.println(filterList);

		// Collecting collections as set
		Set<String> filterSet = myList.stream().filter(i -> i.startsWith("T")).collect(Collectors.toSet());
		System.out.println(filterSet);

		List<Temp> myUserList = new ArrayList<>();

		myUserList.add(new Temp("26", "Mr", "Sreekar C", 614, "26-06-2019", "26-06-2020"));
		
		Map<Object, Object> myMap=myUserList.stream().collect(Collectors.toMap(temp->temp.getClass().getCanonicalName(),Temp::getAge));
System.out.println(myMap);


	}
	private String getClassName() {
		return "age";
	}
}

class Temp {

	String age;
	String title;
	String description;
	int id;
	String startdate;
	String enddate;

	public Temp(String age, String title, String description, int id, String startdate, String enddate) {

		this.age = age;
		this.title = title;
		this.description = description;
		this.id = id;
		this.startdate = startdate;
		this.enddate = enddate;

	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

}
