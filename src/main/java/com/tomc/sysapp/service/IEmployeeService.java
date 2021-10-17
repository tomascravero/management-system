package com.tomc.sysapp.service;

import com.tomc.sysapp.model.employee.impl.Employee;

public interface IEmployeeService {

	Iterable<Employee> getEmployees();

}
