package com.mindtree.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.val;

@Data
@ControllerAdvice
public class MyCustomException extends Exception {

	private static final long serialVersionUID = 1429053220922708928L;
	private static final Logger logger = LoggerFactory.getLogger(MyCustomException.class);

	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "IOException occured")
	@ExceptionHandler(value=MyCustomException.class)
	public void myException(HttpServletResponse response) throws IOException {
	//	logger.info("IOException occured" + request.getRequestURL());
		 response.sendError(HttpStatus.NOT_FOUND.value());
	}

}
