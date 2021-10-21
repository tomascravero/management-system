package com.tomc.sysapp;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SYSParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SYSParkingApplication.class, args);
		LocalDate localDate = LocalDate.now();
		System.out.println("************************************");
		System.out.println("RUNNING - " + localDate);
		System.out.println("************************************");
	}

}
