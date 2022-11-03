package com.greatlearning.EmployeeManagementSystem.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.EmployeeManagementSystem.entity.Employees;

public interface EmployeeService {
	public List<Employees> findAll();

	public Optional<Employees> findById(int theId);

	public String save(Employees theEmployee);

}
