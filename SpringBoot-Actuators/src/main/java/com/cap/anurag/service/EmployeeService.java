package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;

import com.cap.anurag.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee emp) ;
    
	Employee findEmployee(Integer empId);
    
	List<Employee> findAllEmployees();
    
	Employee updateEmployee(Employee emp);
	
	Employee deleteEmpById(Integer empId);
	
	}

