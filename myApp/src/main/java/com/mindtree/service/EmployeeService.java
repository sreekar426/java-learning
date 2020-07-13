package com.mindtree.service;

import java.util.List;

import com.mindtree.model.EmployeeModel;

/**
 * The Interface EmployeeService.
 */
public interface EmployeeService {

	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	List<EmployeeModel> getAllEmployees();

	/**
	 * Gets the employeeby id.
	 *
	 * @param Id the id
	 * @return the employeeby id
	 */
	EmployeeModel getEmployeebyId(String Id);

	/**
	 * Employee save.
	 */
	void employeeSave(List<EmployeeModel> employeesList);

}
