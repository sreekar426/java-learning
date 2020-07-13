package com.mindtree.controller;

import java.util.List;

import javax.persistence.PersistenceProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mindtree.exception.MyCustomException;
import com.mindtree.model.Books;
import com.mindtree.model.Employee;
import com.mindtree.model.LoginModel;
import com.mindtree.repository.BookRepository;
import com.mindtree.repository.EmployeeRepository;
import com.mindtree.service.EmployeeService;
import com.mindtree.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private BookRepository bookRepository;



	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "This is what i was looking for";
	}

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return bookRepository.findAll();
	}

	@PostMapping("/addBooks")
	public String addBooks(@RequestBody Books booksModel) {

		Employee emp = employeeService.getEmpById(booksModel.getEmpId().intValue());

		booksModel.setEmployee(emp);

		bookRepository.save(booksModel);

		return "saved Succesfully";
	}
	
	@DeleteMapping("/deleteBooks/{bookId}")
	public List<Books> deleteBooks(@PathVariable int bookId) {
		bookRepository.deleteById(Integer.valueOf(bookId));

		return bookRepository.findAll();

	}

	/**
	 * Gets the all emp.
	 *
	 * @return the all emp
	 * @throws JsonProcessingException
	 */
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp() throws JsonProcessingException {

		return employeeService.listOfEmployee();

	}
	
	@DeleteMapping("/deleteEmployee/{empId}")
	public List<Employee> deleteEmp(@PathVariable int empId) throws MyCustomException {
		employeeRepository.deleteById(Integer.valueOf(empId));
		return employeeService.listOfEmployee();

	}

	/**
	 * Save employee list.
	 *
	 * @param employeeModel the employee model
	 * @return the string
	 */
	@PostMapping("/addEmpList")
	public Employee saveEmployeeList(@RequestBody Employee employeeModel) {
		employeeService.empSave(employeeModel);
		System.out.println(employeeModel);
		return employeeModel;

	}

	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 * @throws MyCustomException 
	 */
	@GetMapping("/getEmp/{id}")
	public Employee getById(@PathVariable int id) throws MyCustomException {

		if(id==2)
			throw new MyCustomException() ;
		return employeeService.getEmpById(id);

	}

	/**
	 * Del emp by id.
	 *
	 * @param id the id
	 * @return the list
	 */
	@DeleteMapping("/deleteEmp/{id}")
	public List<Employee> delEmpById(@PathVariable int id) {
		List<Employee> deleteList = employeeService.listOfEmployee();
		Employee emp = deleteList.stream().filter(o -> o.getEmpId() == id).findFirst().get();
		deleteList.remove(emp);
		return deleteList;

	}

	@PostMapping("/login")
	public LoginModel authentication(@RequestBody LoginModel loginModel) {

		return loginService.loginAuth(loginModel.getUserName(), loginModel.getPassword());

	}

}
