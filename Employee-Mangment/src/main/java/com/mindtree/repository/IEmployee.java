package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.Employee;

public interface IEmployee extends JpaRepository<Employee, String> {

}
