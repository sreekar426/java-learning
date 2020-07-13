package com.mindtree.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.model.EmployeeModel;
import com.mindtree.repository.EmployeeRepository;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	/** The employee repository. */
	@Autowired
	private EmployeeRepository employeeRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.dao.EmployeeDao#allEmployees()
	 */
	@Override
	public List<EmployeeModel> allEmployees() {
		return employeeRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.dao.EmployeeDao#employeeId(java.lang.String)
	 */
	@Override
	public EmployeeModel employeeId(String id) {
		return employeeRepository.findByEmpId(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.dao.EmployeeDao#saveEmployee(java.util.List)
	 */
	@Override
	public void saveEmployee(List<EmployeeModel> empList) {
		employeeRepository.saveAll(empList);

	}

}
