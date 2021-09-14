package com.tomc.sysapp.DAO.employee;

import java.util.List;

import com.tomc.sysapp.DAO.IGenericDAO;
import com.tomc.sysapp.model.employee.IEmployee;
import com.tomc.sysapp.model.employee.impl.Employee;

public interface IEmployeeDAO extends IGenericDAO<IEmployee> {
	
	IEmployee getEmployeeWithMaxHours();
}
