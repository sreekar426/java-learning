package com.mindtree.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.dao.LoginDao;
import com.mindtree.model.LoginModel;
import com.mindtree.repository.LoginRepository;

@Component
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public List<LoginModel> loginAuthDao(String usrName, String pwd) {
		
		return loginRepository.findByPassword(pwd);
	}

}
