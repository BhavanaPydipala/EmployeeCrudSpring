package com.cap.anurag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cap.anurag.dao.EmployeeDaoImplementation;
import com.cap.anurag.entity.Employee;


@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {
@Autowired
EmployeeDaoImplementation  empDao;
public Employee createEmployee(Employee emp)
{
	return empDao.createEmployee(emp);
	
	
}
public Employee findEmployee(Integer empId)
{
	
	return empDao.findById(empId);
}
public  Employee updateEmployee(Employee emp){
	return empDao.updateEmp(emp);
	
}







public List<Employee> deleteEmpById(Integer empId) {
	return empDao.deleteEmp(empId);
	
	}
@Override
public List<Object> findAllEmployees() {
	// TODO Auto-generated method stub
	return empDao.findAllEmployees();
}

}
