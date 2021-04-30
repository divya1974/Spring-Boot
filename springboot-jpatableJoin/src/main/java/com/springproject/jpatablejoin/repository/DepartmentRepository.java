package com.springproject.jpatablejoin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springproject.jpatablejoin.entity.Department;
import com.springproject.jpatablejoin.entity.DeptEmpDto;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
}
