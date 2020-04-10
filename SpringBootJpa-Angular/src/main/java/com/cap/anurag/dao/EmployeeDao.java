package com.cap.anurag.dao;

import java.util.List;

import com.cap.anurag.entity.Employee;

public interface EmployeeDao {
	
	Employee createEmployee(Employee emp);
	
	public Employee findById(Integer empId);
	
	public Employee updateEmp(Employee emp);
	
	public List<Employee> deleteEmp(Integer empId);
	
	List<Object> findAllEmployees();
	
}
