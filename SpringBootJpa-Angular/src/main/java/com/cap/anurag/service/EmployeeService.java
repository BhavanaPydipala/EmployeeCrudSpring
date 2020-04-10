package com.cap.anurag.service;

import java.util.List;

import com.cap.anurag.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee emp) ;
    
	Employee findEmployee(Integer empId);
    

    
	Employee updateEmployee(Employee emp);
	
	

	List<Object> findAllEmployees();

	List<Employee> deleteEmpById(Integer empId);
	
	}
