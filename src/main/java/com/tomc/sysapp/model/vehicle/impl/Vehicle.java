package com.tomc.sysapp.model.vehicle.impl;

import com.tomc.sysapp.model.element.impl.Entity;
import com.tomc.sysapp.model.vehicle.ICar;

public class Vehicle extends Entity implements ICar {

	private long id;
	private String patente;
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
