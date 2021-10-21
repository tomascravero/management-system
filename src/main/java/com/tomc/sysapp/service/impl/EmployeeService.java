package com.tomc.sysapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomc.sysapp.model.employee.impl.Employee;
import com.tomc.sysapp.repositories.IEmployeeRepository;
import com.tomc.sysapp.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	private IEmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	public Employee findById(long id) {
		Employee employee = employeeRepository.getById(id);
		return employee;
	}

	public Employee save(Employee employee) {
		Employee employeePersisted = employeeRepository.save(employee);
		return employeePersisted;

	}
}
