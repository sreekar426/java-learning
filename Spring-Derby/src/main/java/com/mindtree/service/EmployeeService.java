package com.mindtree.service;

import java.util.List;

import com.mindtree.model.Employee;

public interface EmployeeService {

	/**
	 * List of employee.
	 *
	 * @return the list
	 */
	List<Employee> listOfEmployee();

	/**
	 * Gets the emp by id.
	 *
	 * @param id the id
	 * @return the emp by id
	 */
	Employee getEmpById(int id);

	/**
	 * Emp save.
	 *
	 * @param listEmp the list emp
	 */
	void empSave(Employee listEmp);

}
