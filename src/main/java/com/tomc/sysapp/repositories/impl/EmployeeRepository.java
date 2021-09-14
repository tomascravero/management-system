package com.tomc.sysapp.repositories.impl;

import java.util.Optional;

import com.tomc.sysapp.model.employee.IEmployee;
import com.tomc.sysapp.repositories.IEmployeeRepository;

public class EmployeeRepository implements IEmployeeRepository {

	@Override
	public <S extends IEmployee> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IEmployee> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<IEmployee> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<IEmployee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IEmployee> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(IEmployee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends IEmployee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IEmployee getEmployeeWithMaxHours() {
		// TODO Auto-generated method stub
		return null;
	}

}
