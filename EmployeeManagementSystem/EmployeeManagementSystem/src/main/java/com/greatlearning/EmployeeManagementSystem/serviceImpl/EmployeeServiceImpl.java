package com.greatlearning.EmployeeManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.entity.Employees;
import com.greatlearning.EmployeeManagementSystem.repository.EmployeeRepository;
import com.greatlearning.EmployeeManagementSystem.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
		@Autowired
		EmployeeRepository employeeRepository;
	@Override
	public List<Employees> findAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employees> findById(int theId) {
		boolean ifEmployeeExistByid=employeeRepository.existsById(theId);
		if(ifEmployeeExistByid) {
			return employeeRepository.findById(theId);
		}
		else {
			throw new RuntimeException("This Id does not Exist");
		}
		
	}

	@Override
	public String save(Employees theEmployee) {
		if(theEmployee.getFirstName()==""|| theEmployee.getLastName()==""||
				theEmployee.getEmail()==""){
					throw new RuntimeException("All fields are Mandatory");
				}else {
					employeeRepository.saveAndFlush(theEmployee);
					return "Employee Added Successfully with details: \nid" +theEmployee.getId()
					+"\nwith first name :" +theEmployee.getFirstName()+"\nwith last Name :"+
							theEmployee.getEmail();
				}
		
		
	}

}
