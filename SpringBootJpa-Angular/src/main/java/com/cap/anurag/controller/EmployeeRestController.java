package com.cap.anurag.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/EmployeeCrud")
@CrossOrigin("http://localhost:4200")
public class EmployeeRestController {

	@Autowired	
	EmployeeService empService;
	
	//**********create an account***************
	@PostMapping("/CreateAccount")
	public ResponseEntity<String> createAccount(@RequestBody Employee emp)
	{
		empService.createEmployee(emp);
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("the employee was created successfully", HttpStatus.OK);
		return responseEntity;
	}
	
	
	//***********getting the employee details based on given employeeid**************
	@GetMapping("/findById/{empId}")
	public ResponseEntity<Employee> findEmployee(@PathVariable Integer empId)
	{
		Employee emp =   empService.findEmployee(empId);
		
		if(emp == null) {
			ResponseEntity<Employee>responseEntity = new ResponseEntity<Employee>(emp, HttpStatus.OK); 
			return responseEntity;
		}
		else {
			ResponseEntity<Employee>responseEntity = new ResponseEntity<Employee>(emp, HttpStatus.OK); 
			return responseEntity;
		}
		
	}
	
	
	
	
	//***********fetching all the employee details**************
	@GetMapping("/ListAllEmployees")
	
	public List<Object> findAllEmployees()
	{
		List <Object>list = empService.findAllEmployees();
		
		return list;
	}
	

	
	//**********updating the employee details***************
	@PutMapping("/updateEmp")
	public ResponseEntity<String> updateEmp(@RequestBody Employee emp)
	{
		Employee emp1= empService.updateEmployee(emp);
		if(emp1!=null)
		{
			ResponseEntity<String> responseEntity =  new ResponseEntity<String>("Employee details were updated successfully!!",HttpStatus.OK);
			return responseEntity;
		}
		else
		{
			ResponseEntity<String> responseEntity =  new ResponseEntity<String>("Sorry, employee details were not updated",HttpStatus.OK);
			return responseEntity;
		}
		
	}
	
	//***********deleting the emplouee details based on id**************
    @DeleteMapping("/deleteEmpById/{empId}")
    public List<Employee>deleteEmp(@PathVariable ("empId") Integer empId)
    {
	  List<Employee>list =empService.deleteEmpById(empId);
	  return list;
    }
  }



