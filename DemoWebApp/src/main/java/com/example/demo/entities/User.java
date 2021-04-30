package com.example.demo.entities;

import javax.persistence.Entity;

@Entity
public class User {

	Integer UserId;
	String name;
	String source;
	String destination;
	
	public User(Integer userId, String name, String source, String destination) {
		super();
		UserId = userId;
		this.name = name;
		this.source = source;
		this.destination = destination;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
