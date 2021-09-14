package com.tomc.sysapp.repositories;

import com.tomc.sysapp.model.employee.IEmployee;

public interface IEmployeeRepository extends IGenericRepository<IEmployee> {

	IEmployee getEmployeeWithMaxHours();
	
}
