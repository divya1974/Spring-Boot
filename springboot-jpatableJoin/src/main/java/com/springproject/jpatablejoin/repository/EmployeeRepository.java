package com.springproject.jpatablejoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.jpatablejoin.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
		}


