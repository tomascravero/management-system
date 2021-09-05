package com.example.betatest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.betatest.model.users.impl.User;

@SpringBootApplication
public class BetatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetatestApplication.class, args);
		LocalDate localDate = LocalDate.now();
		System.out.println("*************************************");
		System.out.println("Betatest RUNNING - " + localDate);
		System.out.println("*************************************");

	}

}
