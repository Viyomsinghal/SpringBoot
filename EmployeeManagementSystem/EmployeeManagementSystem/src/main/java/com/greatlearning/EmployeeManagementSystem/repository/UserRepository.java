package com.greatlearning.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagementSystem.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
