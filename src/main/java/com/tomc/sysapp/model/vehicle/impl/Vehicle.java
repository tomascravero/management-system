package com.tomc.sysapp.model.vehicle.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.tomc.sysapp.model.vehicle.ICar;

public class Vehicle implements ICar {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
//	@Column(name = "patente")
	private String patente;
//	@Column(name = "brand")
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Brand brand;
	private String customer;

	public Vehicle() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

}
