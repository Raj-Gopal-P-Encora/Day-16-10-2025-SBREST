package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Employee;

public interface EmployeeRepositroy extends JpaRepository<Employee,Integer> {
}
