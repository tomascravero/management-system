package com.tomc.sysapp.controller.employee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tomc.sysapp.controller.GenericController;
import com.tomc.sysapp.model.employee.impl.Employee;
import com.tomc.sysapp.service.impl.EmployeeService;

@RestController
public class EmployeeController extends GenericController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super(employeeService);
		this.employeeService = employeeService;
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		return null;
	}
}
