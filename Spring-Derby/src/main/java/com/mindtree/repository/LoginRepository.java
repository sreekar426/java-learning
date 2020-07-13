package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.LoginModel;
import java.lang.String;
import java.util.List;

public interface LoginRepository extends JpaRepository<LoginModel, String>{
	
	/**
	 * Find by user name and password.
	 *
	 * @param userName the user name
	 * @param pwd the pwd
	 * @return the employee
	 */
	
	List<LoginModel> findByPassword(String pwd);

}
