package com.cap.anurag.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cap.anurag.entity.Employee;
@Repository
public class EmployeeDaoImplementation implements EmployeeDao{

	
	@PersistenceContext
	EntityManager entitymanager;
	public Employee createEmp(Employee emp) {
		//persist(getting error)
		Employee emp1=entitymanager.merge(emp);
		return emp1;
	}

	public Employee findById(Integer empId) {
		Employee emp=entitymanager.find(Employee.class,empId);
		return emp;
	}
	

	public Employee updateEmp(Employee emp) {
		
		Employee e=entitymanager.find(Employee.class, emp.getEid());
		e.setEname(emp.getEname());
		e.setEsal(emp.getEsal());
		entitymanager.merge(e);
		return e;
	}

	public Employee deleteEmp(Integer empId) {
		Employee e2=entitymanager.find(Employee.class,empId);
		entitymanager.remove(e2);
		return null;
	}

/*	public boolean existsById(Integer empId) {
		// TODO Auto-generated method stub
		return false;
	}

	public void deleteById(Integer eId) {
		// TODO Auto-generated method stub
		
	}

	public boolean ispresent(Integer employeeId) {
		// TODO Auto-generated method stub
		return false;
	}*/
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Employee emp1=entitymanager.merge(emp);
		return emp1;

	}

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}
    @Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		Query q=entitymanager.createQuery("from Employee");
		List<Employee> list=q.getResultList();
		return list;
	}

	}
