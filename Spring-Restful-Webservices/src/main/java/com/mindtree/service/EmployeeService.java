package com.mindtree.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.dto.EmployeeDto;

@Service
public class EmployeeService {

	public List<EmployeeDto> getAllEmp() {

		List<EmployeeDto> asList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			asList.add(new EmployeeDto(i, "employee" + i));
		return asList;

	}
}
