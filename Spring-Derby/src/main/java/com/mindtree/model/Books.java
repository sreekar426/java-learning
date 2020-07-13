package com.mindtree.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Books implements Serializable {

	private static final long serialVersionUID = 3224328952010628940L;

	/** The book id. */
	@Id
	@Column(name = "BOOK_ID")
	private int bookId;

	/** The book name. */
	@Column(name = "BOOK_NAME")
	private String bookName;

	/** The book author. */
	@Column(name = "BOOK_AUTHOR")
	private String bookAuthor;

	/** The book description. */
	@Column(name = "BOOK_DESCRIPTION")
	private String bookDiscription;
	
	/** The emp id. */
	@Column(name = "EMPLOYEE_EMP_ID")
	private Integer empId;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_EMP_ID",insertable=false,updatable=false)
	@JsonIgnore
	private Employee employee;

	

}
