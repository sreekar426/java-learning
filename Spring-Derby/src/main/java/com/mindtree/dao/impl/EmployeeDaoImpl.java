package com.mindtree.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.model.Employee;
import com.mindtree.repository.EmployeeRepository;

/**
 * The Class EmployeeDaoImpl.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	/** The employee repository. */
	@Autowired
	private EmployeeRepository employeeRepository;

	/* (non-Javadoc)
	 * @see com.mindtree.dao.EmployeeDao#getAllEmpList()
	 */
	@Override
	public List<Employee> getAllEmpList() {

		return employeeRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.mindtree.dao.EmployeeDao#getEmpDetails(java.lang.String)
	 */
	@Override
	public Employee getEmpDetails(int id) {

		return employeeRepository.findByEmpId(id);
	}

	/* (non-Javadoc)
	 * @see com.mindtree.dao.EmployeeDao#saveEmpDetails(java.util.List)
	 */
	@Override
	public void saveEmpDetails(Employee empList) {
		employeeRepository.save(empList);

	}

}
