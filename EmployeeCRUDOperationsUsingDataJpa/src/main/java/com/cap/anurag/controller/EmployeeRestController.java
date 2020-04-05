package com.cap.anurag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.Employee;
import com.cap.anurag.service.EmployeeService;


@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:4981")
public class EmployeeRestController {

	@Autowired
	EmployeeService empService;
	
	//1)CREATE ACCOUNT
	//**************************************************
	@PostMapping("/CreateAccount")
	public String createAccount(@RequestBody Employee emp)
	{
		Employee employee=empService.createEmployee(emp);
		if(employee==null)
		{
			return "Insertion Failed!!!!!";
		}
		else
		{
			return "Inserted the record Successfully!!!!!!";
		}
		
	}
	//**************************************************
	
	
	//2)LIST ALL EMPLOYEES
	//**************************************************
	@GetMapping("/ListAllEmployees")
	public List<Employee> findAllEmployees()
	{
		return empService.findAllEmployees();
	}
	//**************************************************
	
	//3)UPDATE EMPLOYEE
	//*************************************************
	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee emp)
	{
		Employee emp1= empService.updateEmployee(emp);
		if(emp1!=null)
		{
			return "updated the records Successfully as "+emp.getEid()+" "+emp.getEname()+" "+emp.getEsal();
		}
		else
		{
			return "employee details not updated";
		}
	}
	//************************************************
	
	//FIND EMPLOYEE BY ID
	//************************************************
	@GetMapping("/findById/{empId}")
	public Employee findEmployeeById(@PathVariable Integer empId)
	{
		return empService.findEmployeeById(empId);
		
	}
	//***********************************************
	
	//DELETE EMPLOYEE BY ID
    //***********************************************
	@DeleteMapping("/deleteById/{empId}")
    public void deleteEmployeeById(@PathVariable Integer empId)
    {
	   empService.deleteEmployeeById(empId); 
    }
	//***********************************************
	
    //DELETE ALL EMPLOYEES
	//***********************************************
	@DeleteMapping("/deleteAllEmployees")
	public void deleteAllEmployees()
	{
		empService.deleteAllEmployees();
		System.out.println("Deleted Successfully:");
	}
  }



