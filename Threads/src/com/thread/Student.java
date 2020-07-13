package com.thread;

import java.io.Serializable;

public class Student implements Comparable<Student> ,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5438654846920156744L;
	private int Id;
	private String Name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int compareTo(Student o) {

		if (o.getId() > this.Id) {
			return 1;
		} else {
			return -1;
		}

	}

}
