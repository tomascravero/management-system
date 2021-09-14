package com.tomc.sysapp.model.branches.impl;

import com.tomc.sysapp.model.branches.IBranch;
import com.tomc.sysapp.model.element.impl.Entity;
import com.tomc.sysapp.model.employee.impl.Employee;

public class Branch extends Entity implements IBranch {
	
	private Employee employee;

	public Branch() {
		super();
	}
	
	@Override
	public Employee getEmployee() {
		return employee;
	}

}
