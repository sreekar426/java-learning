package com.mindtree.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.dto.EmployeeDto;
import com.mindtree.service.EmployeeService;

@RestController
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET,produces="application/json")
	Response getAllEmployees() {
		EmployeeService employeeService = new EmployeeService();
		employeeService.getAllEmp();
		return Response.status(400).entity("Bad Request..").build();
	}
	
	@GetMapping(value = "test/{fromDate}/{toDate}")
	void getDate(@PathVariable("fromDate") Timestamp fromDate, @PathVariable("fromDate") Timestamp toDate) {

		System.out.println(fromDate);
		System.out.println(toDate);
	}

}
