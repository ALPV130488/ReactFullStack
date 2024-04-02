package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.Services;

@RestController
@RequestMapping("/emp")//http://localhost:9876/emp
public class Controller {
	
	 
	
	@Autowired
	Services service;
	
	@GetMapping("/display")//http://localhost:9876/emp/display
	public String display() {
		
		return "Hi rehman!!!How are you?";
	}
	
	
	@PostMapping("/addemployee")//http://localhost:9876/emp/addemployee
	public String insertEmployee(@RequestBody Employee emp) {
		
		return service.addEmployee(emp);
		
	}
	
	
	
	@PutMapping("/updateemployee")
	public String updateEmployee(@RequestBody Employee emp) {
			return service.updateEmployee(emp);
	}
	
	@DeleteMapping("/deleteemployee/{empid}")
	public String deleteEmployee(@PathVariable("empid") int empId) {
		return service.deleteEmployee(empId);
	}
	
	@GetMapping("/getemployee/{empid}")
	public Employee getEmployee(@PathVariable("empid") int empId) {
		
		return service.getEmployee(empId);
	}
	

}
