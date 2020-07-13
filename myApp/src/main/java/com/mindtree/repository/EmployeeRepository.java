package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.EmployeeModel;

/**
 * The Interface EmployeeRepository.
 */
public interface EmployeeRepository extends JpaRepository<EmployeeModel, String> {

	/**
	 * Find by emp id.
	 *
	 * @param id the id
	 * @return the employee model
	 */
	EmployeeModel findByEmpId(String id);
}
