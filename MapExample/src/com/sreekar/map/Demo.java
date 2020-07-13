package com.sreekar.map;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(2);

		Map<Employee, String> empMap = new HashMap<Employee, String>();
		NavigableMap<K, V>
TreeMap<K, V>
		empMap.put(emp1, "Sreekar");
		empMap.put(emp2, "Sreekar");

		 System.out.println(empMap.size());

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		Map<Integer, String> integerMap = new HashMap<Integer, String>();

		integerMap.put(i1, "one");
		integerMap.put(i2, "one");

		System.out.println(integerMap.size());

	}

}

class Employee {
	
	


	private int empId;

	public Employee(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	

}
