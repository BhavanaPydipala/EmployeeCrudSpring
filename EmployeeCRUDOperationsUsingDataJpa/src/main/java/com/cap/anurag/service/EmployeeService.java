package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;

import com.cap.anurag.entity.Employee;

public interface EmployeeService 
{


	Employee createEmployee(Employee emp) ;
    
    List<Employee> findAllEmployees();
    
    Employee updateEmployee(Employee emp);
    
	void deleteAllEmployees();
	
	Employee findEmployeeById(Integer empId);
	
	void deleteEmployeeById(Integer empId);
	
}
