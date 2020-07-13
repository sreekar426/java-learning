package com.mindtree.dao;

import java.util.List;

import com.mindtree.model.LoginModel;

public interface LoginDao {

	/**
	 * Login auth dao.
	 *
	 * @param usrName the usr name
	 * @param pwd the pwd
	 * @return the employee
	 */
	public List<LoginModel> loginAuthDao(String usrName,String pwd);
	
}
