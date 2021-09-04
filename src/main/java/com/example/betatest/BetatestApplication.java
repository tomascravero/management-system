package com.example.betatest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.betatest.model.users.impl.SuperUser;
import com.example.betatest.model.users.impl.User;

@SpringBootApplication
public class BetatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetatestApplication.class, args);
		System.out.println("*************************************");
		System.out.println("Betatest RUNNING");
		Date date = new Date();
		SimpleDateFormat dateformatter = new SimpleDateFormat("dd-MMM,yyyy");
		System.out.println(dateformatter.format(date));
		System.out.println("*************************************");

	}

}
