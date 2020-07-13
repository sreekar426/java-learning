package com.mindtree.model;

import lombok.Data;

@Data
public class ExceptionMessage {

	private String errorMessage;
	private String errorCode;

	@Override
	public String toString() {
		return "ExceptionMessage [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}

}
