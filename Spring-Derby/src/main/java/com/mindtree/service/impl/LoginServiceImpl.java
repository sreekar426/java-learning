package com.mindtree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.LoginDao;
import com.mindtree.model.LoginModel;
import com.mindtree.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public LoginModel loginAuth(String empUserName, String empPwd) {
		LoginModel login = new LoginModel();
		List<LoginModel> loginModel = loginDao.loginAuthDao(empUserName, empPwd);

		if (null != loginModel && !loginModel.isEmpty()) {
			for (LoginModel result : loginModel) {
				if (result.getUserName().equals(empUserName)) {
					login.setUserName(empUserName);
					login.setStatusCode(200);
					login.setUserResponse("Success");
				} else {
					login.setUserName(empUserName);
					login.setStatusCode(401);
					login.setUserResponse("in valid credentials please try with valid credentials");
				}
			}
		} else {
			login.setUserName(empUserName);
			login.setStatusCode(401);
			login.setUserResponse("In valid credentials..!");
		}
		return login;
	}

}
