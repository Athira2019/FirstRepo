package com.letstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letstart.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findOne(Long id);

}
