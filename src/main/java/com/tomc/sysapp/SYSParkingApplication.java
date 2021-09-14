package com.tomc.sysapp;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tomc.sysapp.model.users.impl.User;

@SpringBootApplication
public class SYSParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SYSParkingApplication.class, args);
		LocalDate localDate = LocalDate.now();
		System.out.println("*************************************");
		System.out.println("RUNNING - " + localDate);
		System.out.println("*************************************");
	}

}
