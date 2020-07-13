package com.mindtree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Employee {
	
	@Id
	@Column(name="emp_id")
	int empId;
	
	@Column(name="emp_name")
	String empName;
	
	@ManyToOne
	@JoinColumn(name="project_name",insertable=false,updatable=false)
	@JsonIgnore
	private Project projects;
	

}
