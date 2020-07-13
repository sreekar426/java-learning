package com.mindtree.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Employee implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The emp id. */
	@Id
	@Column(name = "EMP_ID")
	private int empId;

	/** The emp name. */
	@Column(name = "EMP_NAME")
	private String empName;

	/** The emp mobile number. */
	@Column(name = "EMP_MOBILE")
	private String empMobileNumber;

	/** The address. */
	@Column(name = "EMP_ADDRESS")
	private String empAddress;
	
	@OneToMany(mappedBy="employee", cascade=CascadeType.ALL)
	private List<Books> books;


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", empName=" + empName + ", empMobileNumber=" + empMobileNumber
				+ ", address=" + empAddress + "]";
	}

}
