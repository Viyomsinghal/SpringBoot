package com.greatlearning.EmployeeManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagementSystem.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
	List<Employees>findByFirstNameContainsAllIgnoreCases();
	List<Employees>findAllByOrderByFirstNameAsc();

}
