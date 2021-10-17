package com.tomc.sysapp.model.vehicle.impl;

import com.tomc.sysapp.model.vehicle.IBrand;

public class Brand implements IBrand {

	private long id;
	private String name;

	public Brand(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
