package com.example.betatest.model.users.impl;

public class Admin extends SuperUser {

	private int range;

	public Admin() {

	}

	public Admin(int range, int points, String firstName, String lastName, String email, int age, String country,
			String departament) {
		super(points, firstName, lastName, email, age, country, departament);
		this.range = range;
	}
}
