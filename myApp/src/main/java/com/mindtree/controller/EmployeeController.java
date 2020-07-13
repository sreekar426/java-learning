package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.model.EmployeeModel;
import com.mindtree.service.EmployeeService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String home(){
        return "This is what i was looking for";                      
   }

	@PostMapping("/addEmpList")
	public String saveEmployeeList(@RequestBody List<EmployeeModel> employeeModel) {
		employeeService.employeeSave(employeeModel);
		return employeeModel.size() + "had saved scucess fully";

	}

	@GetMapping("/getAllEmployees")
	public List<EmployeeModel> getAllEmpList() {
		return employeeService.getAllEmployees();

	}

}
