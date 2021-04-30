package com.springproject.jpatablejoin.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name = "department")
public class Department {

	
public Department()
{
	
}
public Department(long dept_id, String name, String description)
{
	super();
	this.dept_id=dept_id;
	this.name=name;
	this.description=description;
}
	@Id
	@Column(name = "dept_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long dept_id;

	@Column(name = "name")
	public String name;

	@Column(name = "description")
	public String description;

	
	
	public long getId() {  
        return dept_id;  
    }  
    public void setId(int id) {  
        this.dept_id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getDescription() {  
        return description;  
    }  
    public void setDescription(String description) {  
        this.description = description;  
    }
    
    /*added employees 
    public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
   */
/*	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", description=" + description + "]";
	}*/
}