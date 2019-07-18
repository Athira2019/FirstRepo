package com.letstart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letstart.dao.EmployeeDAO;
import com.letstart.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	@Autowired
	EmployeeDAO employeeDAO;
	
	/*Save an employee*/
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp)
	{
		return employeeDAO.save(emp);
		
	}
	/*Get all employees*/
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeDAO.findAll();
		
	}
	
	/*Get employee by id*/
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable (value="id" )Long empId)
	{
		Employee emp=employeeDAO.findOne(empId);
		
		if(emp==null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
	}
	
	/*update an employee with empID*/
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable (value="id")Long empId,@Valid @RequestBody Employee empDetails)
	{
		Employee emp=employeeDAO.findOne(empId);
		if(emp==null)
		{
			return ResponseEntity.notFound().build();
		}
		emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());
		emp.setDesignation(empDetails.getExpertise());
		
		Employee updateEmployee=employeeDAO.save(emp);
		
		return ResponseEntity.ok().body(emp);
		
	}
	/*Delete an employee*/
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable (value="id")Long empId)
	{
		Employee emp=employeeDAO.findOne(empId);

		if(emp==null)
		{
			return ResponseEntity.notFound().build();
		}
		employeeDAO.deleteEmployee(emp);
		
		return ResponseEntity.ok().body(emp);
		
	}

}
