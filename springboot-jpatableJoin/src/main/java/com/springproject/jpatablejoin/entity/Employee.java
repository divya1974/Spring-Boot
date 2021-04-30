package com.springproject.jpatablejoin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import javax.persistence.Id;

@Entity
@Table(name = "employee")
public class Employee {

public Employee()
{
		
}
public Employee(long emp_id, String name, String email,String address,long dept_id)
	{
		super();
		this.emp_id=emp_id;
		this.name=name;
		this.email=email;
		this.address=address;
		this.dept_id=dept_id;
	}
		@Id
		@Column(name = "emp_id")
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		public long emp_id;

		@Column(name = "name")
		public String name;

		@Column(name = "email")
		public String email;

		@Column(name = "address")
		public String address;

		@Column(name = "dept_id")
		public long dept_id;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "dept_id", insertable = false, updatable = false)
		@Fetch(FetchMode.JOIN)
		private Department department;

	        //getters and setters
		
		
		public long getId() {  
	        return emp_id;  
	    }  
	    public void setId(long emp_id) {  
	        this.emp_id = emp_id;  
	    }  
	    public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public String getEmail() {  
	        return email;  
	    }  
	    public void setEmail(String email) {  
	        this.email = email;  
	    } 
	    
	    public String getAddress() {  
	        return address;  
	    }  
	    public void setAddress(String address) {  
	        this.address = address;  
	    } 
	    
	 public long getDept_id() {  
	        return dept_id;  
	    }  
	    public void setDept_id(long dept_id) {  
	        this.dept_id = dept_id;  
	    }
	    
	    public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}
		
		/*@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ",address="+ address + ", dept_id=" + dept_id + "]";
		}*/
	}

