package com.tomc.sysapp.model.employee;

import com.tomc.sysapp.model.element.IEntity;

public interface IEmployee extends IEntity {

	/**
	 * Retorna el nombre del empleado.
	 * 
	 * @return String
	 */
	public String getEmployeeName();

	/**
	 * Retorna el ID del empleado.
	 * 
	 * @return
	 */
	public Long getEmployeeId();

}
