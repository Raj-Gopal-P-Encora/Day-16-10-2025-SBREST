package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Employee;
import com.test.repository.EmployeeRepositroy;

@Service
public class EmployeeService {
	@Autowired
	private final EmployeeRepositroy repo;
	
	public EmployeeService(EmployeeRepositroy repo) {
		this.repo=repo;		
	}
	
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public Employee updateEmployee(int id,Employee employee) {
		Employee existing = repo.findById(id).orElse(null);
		
		if(existing!=null) {
			existing.setName(employee.getName());
			existing.setAddress(employee.getAddress());
			return repo.save(existing);
		}
		return null;
	}
	
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

}
