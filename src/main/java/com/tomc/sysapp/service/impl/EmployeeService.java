package com.tomc.sysapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomc.sysapp.repositories.impl.EmployeeRepository;
import com.tomc.sysapp.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
}
