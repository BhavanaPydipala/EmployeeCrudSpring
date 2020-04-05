package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cap.anurag.dao.EmployeeDao;
import com.cap.anurag.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService 
{
   @Autowired

   EmployeeDao  empDao;

   EntityManager manager;
 
   public Employee createEmployee(Employee emp)

   {
	   return empDao.save(emp);
	

   }

   public  Employee updateEmployee(Employee emp)
   
   {
	
	   return empDao.save(emp);
	

   }

   @Override

   public List<Employee> findAllEmployees()
   {
	// TODO Auto-generated method stub
	
	   return empDao.findAll();

   }

   @Override

   public void deleteAllEmployees()
   {
	// TODO Auto-generated method stub
	
	   empDao.deleteAll();
	

   }

   @Override

   public Employee findEmployeeById(Integer empId)
   {
	// TODO Auto-generated method stub
	
	   return empDao.findById(empId);

   }


   @Override

   public void deleteEmployeeById(Integer empId)
   {
	
	   empDao.delete(empId);
	

   }

}
