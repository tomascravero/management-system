package com.tomc.sysapp.controller.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tomc.sysapp.exception.enums.ExceptionType;
import com.tomc.sysapp.exception.impl.SYSException;
import com.tomc.sysapp.model.employee.impl.Employee;
import com.tomc.sysapp.service.impl.EmployeeService;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/{id}")
	@ResponseBody
	public Employee getEmployeeById(@PathVariable Long id) throws Exception, SYSException {
		Employee employee = employeeService.findById(id);
		if (employee == null) {
			throw new SYSException(null, null, ExceptionType.NOTFOUND);
		}
		return employee;
	}

	@GetMapping(value = "employee", produces = "application/json")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("Tomas");
		employee.setLastName("Empleado");
		employee.setPhoneNumber("123123");
//		ArrayList<Employee> employees = new ArrayList<Employee>();
//		employees.add(employee);
		// Branch branch = new Branch("Sucursal 1", employees);
		// employee.setBranch(branch);
		return employee;
	}

	@GetMapping(value = "save", produces = "application/json")
	public Employee save() {
		Employee employee = new Employee();
		employee.setFirstName("Tomas");
		employee.setLastName("Empleado");
		employee.setPhoneNumber("123123");
//		ArrayList<Employee> employees = new ArrayList<Employee>();
//		employees.add(employee);
//		Branch branch = new Branch("Sucursal 1", employees);
		// employee.setBranch(branch);
		Employee employeePersisted = employeeService.save(employee);
		return employeePersisted;
	}

	@GetMapping(value = "employees", produces = "application/json")
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}
}
