package com.springproject.jpatablejoin.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.jpatablejoin.entity.Department;

import com.springproject.jpatablejoin.entity.Employee;
import com.springproject.jpatablejoin.repository.DepartmentRepository;
import com.springproject.jpatablejoin.repository.EmployeeRepository;

@Service
public class JoinService {

	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		List<Employee> list= employeeRepository.findAll();
		return list;	  
		
	}
	
	public void addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	
	public List<Department> getDept() {
		List<Department> list= departmentRepository.findAll();
		  return list;	
	}
	
	public void addDepartment(Department department)
	{
		departmentRepository.save(department);
	}	
	
}