package com.mindtree.dto;

import lombok.Data;

@Data
public class EmployeeDto {

	private int empId;
	private String empName;

	public EmployeeDto(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

}
