package com.tomc.sysapp.model.branches;

import com.tomc.sysapp.model.element.IEntity;
import com.tomc.sysapp.model.employee.impl.Employee;

public interface IBranch extends IEntity {
	
	/**
	 * Retorna el empleado de turno de la sucursal.
	 * 
	 * @return Employee
	 */
	public Employee getEmployee();

}
