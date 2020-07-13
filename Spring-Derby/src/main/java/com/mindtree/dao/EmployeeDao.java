package com.mindtree.dao;

import java.util.List;

import com.mindtree.model.Employee;

public interface EmployeeDao {

	/**
	 * Gets the all emp list.
	 *
	 * @return the all emp list
	 */
	public List<Employee> getAllEmpList();
	
	/**
	 * Gets the emp details.
	 *
	 * @param id the id
	 * @return the emp details
	 */
	public Employee getEmpDetails(int id);
	
	/**
	 * Save emp details.
	 *
	 * @param empList the emp list
	 */
	public void saveEmpDetails(Employee empList);
	
}
