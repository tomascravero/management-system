package com.example.betatest.model.branches.impl;

import com.example.betatest.model.branches.IBranch;
import com.example.betatest.model.employee.impl.Employee;

public class Branch implements IBranch {
	
	private Employee employee;

	@Override
	public Employee getEmployee() {
		return employee;
	}

}
