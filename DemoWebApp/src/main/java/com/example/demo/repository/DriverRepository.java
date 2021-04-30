package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Driver;

@Repository 

/*public class DriverRepository {

}*/
public interface DriverRepository extends JpaRepository<Driver,Integer> {

}
