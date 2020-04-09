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
	
	//*************************
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
	
	//*************************
	@GetMapping("/findById/{empId}")
	public Employee findEmployee(@PathVariable Integer empId)
	{
		return empService.findEmployee(empId);
		
	}
	
	//*************************
	@GetMapping("/ListAllEmployees")
	public List<Employee> findAllEmployees()
	{
		return empService.findAllEmployees();
	}
	
	//*************************
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
	
	//*************************
    @DeleteMapping("/deleteEmpById/{empId}")
    public String deleteEmp(@PathVariable ("empId") Integer empId)
    {
	  Employee emp3=empService.deleteEmpById(empId);
	  if(emp3!=null)
   	  {
		return "not deleted";
	  }
	  else
     {
		return "deleted successfully";
	 }
	
    }
  }



