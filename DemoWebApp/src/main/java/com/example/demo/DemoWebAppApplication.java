package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entities.Driver;
import com.example.demo.service.DemoWebService;


@EntityScan("com.example.demo")
@ComponentScan
@SpringBootApplication(scanBasePackages = "com.example.demo")
public class DemoWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebAppApplication.class, args);
		
		/*Driver driver=new Driver(1,"divya","dwarka","bangalore");
		DemoWebService service =new DemoWebService();
		service.AddDriver(driver);*/
	}

}
