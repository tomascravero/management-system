package com.tomc.sysapp.DAO.employee.impl;

import java.util.List;
import java.util.Optional;

import com.tomc.sysapp.DAO.employee.IEmployeeDAO;
import com.tomc.sysapp.model.employee.IEmployee;
import com.tomc.sysapp.model.employee.impl.Employee;

@Deprecated
public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public Optional<IEmployee> readById(Long id) {
		throw new UnsupportedOperationException("Not implemented yet");	
	}

	@Override 
	public void delete(IEmployee obj) {
		throw new UnsupportedOperationException("Not implemented yet");		
	}

	@Override
	public void create(IEmployee obj) {
		throw new UnsupportedOperationException("Not implemented yet");
		
	}

	@Override
	public List<IEmployee> read() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void update(IEmployee t, String[] params) {
		throw new UnsupportedOperationException("Not implemented yet");		
	}

	@Override
	public IEmployee getEmployeeWithMaxHours() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

}
