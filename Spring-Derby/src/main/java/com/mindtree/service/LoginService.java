package com.mindtree.service;

import com.mindtree.model.LoginModel;

/**
 * The Interface LoginService.
 */
public interface LoginService {
	
	/**
	 * Login auth.
	 *
	 * @param empUserName the emp user name
	 * @param empPwd the emp pwd
	 * @return the string
	 */
	public LoginModel loginAuth(String empUserName , String empPwd);

}
