package com.example.demo.entities;

import javax.persistence.Entity;

@Entity
public class Driver {
		
	int DriverId;
	public String name;
	String source;
	String destination;
	
	public Driver( int driverId, String name, String source, String destination) {
		super();
		DriverId = driverId;
		this.name = name;
		this.source = source;
		this.destination = destination;
	}

	public int getDriverId() {
		return DriverId;
	}

	public void setDriverId(int driverId) {
		DriverId = driverId;
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
