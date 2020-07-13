package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.Project;

public interface IProject extends JpaRepository<Project, String>{

	Project findByProjectName(String name);
	
}
