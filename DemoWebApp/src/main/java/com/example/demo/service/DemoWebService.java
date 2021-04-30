package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.example.demo.DemoWebAppApplication;
import com.example.demo.entities.Driver;
import com.example.demo.repository.DriverRepository;
import com.example.demo.repository.UserRepository;

@Service
public class DemoWebService {
	
@Autowired
DriverRepository driverRepository;

@Autowired
UserRepository userRepository;

public void AddDriver(Driver driver)
{
driverRepository.save(driver);	
}



public List<Driver> FindAllDrivers()
{
	return driverRepository.findAll();
	
}

}


