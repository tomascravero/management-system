package com.tomc.sysapp.repositories;

import org.springframework.data.repository.CrudRepository;

public interface IGenericRepository<T> extends CrudRepository<T, Long>{

}
