package com.mindtree.myApp;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.model.Employee;
import com.mindtree.model.Project;
import com.mindtree.repository.IEmployee;
import com.mindtree.repository.IProject;

@Controller
public class HomeController {
	
	@Autowired
	private IProject projectRepository;
	
	@Autowired
	private IEmployee employeeRepository;
	
	@RequestMapping("/test")
    public String home(Map<String, Object> model) {
        model.put("message", "hiii Sreekar");
        return "home";
    }
     
	
	@PostMapping("/addTask")
	public String addTask(@RequestBody Project project) {
		projectRepository.save(project);
		return "Tasks Added Sucessfully";
	}
	
	@PostMapping("/addEmp")
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee details saved Sucessfully";
	}
	
	@GetMapping("/allEmployee")
	public @ResponseBody List<Employee> getAllEmployee() {

		List<Employee> empList = employeeRepository.findAll();
		return empList;

	}
	
	@GetMapping("/project/{projectName}")
	public @ResponseBody Project getProjectWithId(@PathVariable String projectName) {

		Project projects = projectRepository.findByProjectName(projectName);
		return projects;

	}
	
	@GetMapping("/project")
	public @ResponseBody List<Project> getAllProject() {

		List<Project> projects = projectRepository.findAll();
		return projects;

	}
	
	@GetMapping("/view")
	public @ResponseBody List<Project> viewTask() {

		List<Project> projects = projectRepository.findAll();
		return projects;

	}
	
	
	@GetMapping("/")
	public String taskPageView() {
		
		return "viewTask";
	}
	
	@GetMapping("/addTask")
	public String addTaskPage() {
		return "createTask";
	}

}
