package com.tomc.sysapp.service.impl;

import com.tomc.sysapp.repositories.impl.GenericRepository;
import com.tomc.sysapp.service.IGenericService;

public class GenericService implements IGenericService {
	
	private GenericRepository genericRepository;
	
	public GenericService(GenericRepository genericRepository) {
		this.genericRepository = genericRepository;
	}
}
