package com.example.betatest.model.branches;

import com.example.betatest.model.employee.impl.Employee;

public interface IBranch {
	
	/**
	 * Retorna el empleado de turno de la sucursal.
	 * 
	 * @return Employee
	 */
	public Employee getEmployee();

}
