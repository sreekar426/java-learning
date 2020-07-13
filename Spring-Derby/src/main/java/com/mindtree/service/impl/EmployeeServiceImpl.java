package com.mindtree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.model.Employee;
import com.mindtree.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee dao. */
	@Autowired
	EmployeeDao employeeDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.service.EmployeeService#listOfEmployee()
	 */
	@Override
	public List<Employee> listOfEmployee() {
		return employeeDao.getAllEmpList();
	}

	@Override
	public Employee getEmpById(int id) {

		return employeeDao.getEmpDetails(id);
	}

	@Override
	public void empSave(Employee listEmp) {
		employeeDao.saveEmpDetails(listEmp);

	}

}
