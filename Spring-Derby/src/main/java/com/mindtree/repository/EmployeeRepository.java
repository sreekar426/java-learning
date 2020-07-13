package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	/**
	 * Find by emp id.
	 *
	 * @param id the id
	 * @return the employee model
	 */
	Employee findByEmpId(int id);
	
}
