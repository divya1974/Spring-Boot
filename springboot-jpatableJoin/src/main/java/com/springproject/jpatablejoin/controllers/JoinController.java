package com.springproject.jpatablejoin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.jpatablejoin.entity.Department;
import com.springproject.jpatablejoin.entity.DeptEmpDto;
import com.springproject.jpatablejoin.entity.Employee;
import com.springproject.jpatablejoin.service.JoinService;

@RestController
public class JoinController
{
@Autowired
private JoinService joinService;

@GetMapping("table/department")
public List<Department> getDept() {
	return joinService.getDept();
}

@RequestMapping(value="table/adddepartment", method=RequestMethod.POST)
public void addDepartment(@RequestBody Department department)
{
	joinService.addDepartment(department);
}


@GetMapping("table/employee")
public List<Employee> getEmployees() {
	return joinService.getEmployees();
}

@RequestMapping(value="table/addemployee", method=RequestMethod.POST)
public void addDepartment(@RequestBody Employee employee)
{
	joinService.addEmployee(employee);
}

}