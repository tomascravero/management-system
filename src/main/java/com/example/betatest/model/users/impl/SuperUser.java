package com.example.betatest.model.users.impl;

import java.sql.Blob;

import com.example.betatest.model.users.IUser;

public class SuperUser extends User implements IUser {

	private int points;

	public SuperUser() {
		super();
	}

	public SuperUser(int points, String firstName, String lastName, String email, int age,
			String country, String departament) {
		super(firstName, lastName, email, age, country, departament);
		this.points = points;
	}

}
