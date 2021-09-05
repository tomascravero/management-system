package com.example.betatest.model.users.impl;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.betatest.model.users.IUser;
import com.example.betatest.model.users.UserRoleEnum;

@Entity
public class User implements IUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private Blob photo;
	private String country;
	private String departament;
	private UserRoleEnum role;

	public User() {
	}

	public User(String firstName, String lastName, String email, int age, String country, String departament,
			UserRoleEnum role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		// this.photo = photo;
		this.country = country;
		this.departament = departament;
		this.role = role;
	}

	public UserRoleEnum getRole() {
		return role;
	}

	public void setRole(UserRoleEnum role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getCompleteName() {
		return firstName + lastName;
	}

	@Override
	public int getUserAge() {
		return age;
	}

	@Override
	public String getUserEmail() {
		return email;
	}

	@Override
	public Blob getUserPhoto() {
		return photo;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

}
