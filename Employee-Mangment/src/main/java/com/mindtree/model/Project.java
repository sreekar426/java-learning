package com.mindtree.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Project {
	
	@Id
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="project_description")
	private String projectDescription;
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="end_date")
	private String endDate;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy="projects")
	private List<Employee> employee;
	
	

}
