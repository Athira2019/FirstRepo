package com.letstart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letstart.model.Employee;
import com.letstart.repository.EmployeeRepository;
@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	/*save an employee * 
	 */
     public Employee save (Employee emp)
     {
		return employeeRepository.save(emp);
    	 
     }
     /*search all employee*/
     public List<Employee> findAll()
     {
		return employeeRepository.findAll();
    	 
     }
     /*get an employee by id*/
     public Employee findOne(Long id)
     {
		return employeeRepository.findOne(id);
    	 
     }
     
     /*delete employee*/
     public void deleteEmployee(Employee emp)
     {
    	 employeeRepository.delete(emp);
     }
     
}
