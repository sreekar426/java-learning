package com.mindtree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.model.EmployeeModel;
import com.mindtree.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public List<EmployeeModel> getAllEmployees() {
		return employeeDao.allEmployees();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.service.EmployeeService#getEmployeebyId(java.lang.String)
	 */
	@Override
	public EmployeeModel getEmployeebyId(String Id) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.service.EmployeeService#employeeSave(java.util.List)
	 */
	@Override
	public void employeeSave(List<EmployeeModel> employeesList) {

	}

}
