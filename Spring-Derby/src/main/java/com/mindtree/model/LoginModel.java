package com.mindtree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name ="UserDetails")
@Data

public class LoginModel {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	/** The user name. */
	private String userName;
	
	/** The password. */
	private String password;
	
	/** The user response. */
	@Transient
	private String userResponse;
	
	/** The user response. */
	@Transient
	private int statusCode;
	

}
