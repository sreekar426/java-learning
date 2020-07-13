package com.mindtree.dao;

import java.util.List;

import com.mindtree.model.EmployeeModel;

// TODO: Auto-generated Javadoc
/**
 * The Interface EmployeeDao.
 */
public interface EmployeeDao {

	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	List<EmployeeModel> allEmployees();

	/**
	 * Employee id.
	 *
	 * @param Id the id
	 * @return the list
	 */
	EmployeeModel employeeId(String Id);

	/**
	 * Save employee.
	 */
	void saveEmployee(List<EmployeeModel> empList);

}
