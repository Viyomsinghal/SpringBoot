package com.greatlearning.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.EmployeeManagementSystem.entity.Employees;
import com.greatlearning.EmployeeManagementSystem.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	private EmployeeService employeeService;
	@Autowired
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService=theEmployeeService;
	}
	

	
	@GetMapping("/employee")
	public List<Employees> findAll(){
		return employeeService.findAll();
		
	}

}
