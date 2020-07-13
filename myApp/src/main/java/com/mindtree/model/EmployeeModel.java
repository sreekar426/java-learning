package com.mindtree.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
public class EmployeeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The emp id. */
	@Id
	private String empId;

	/** The emp name. */
	private String empName;

	/** The emp mobile number. */
	private String empMobileNumber;

	/** The address. */
	private String address;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", empName=" + empName + ", empMobileNumber=" + empMobileNumber
				+ ", address=" + address + "]";
	}

}
