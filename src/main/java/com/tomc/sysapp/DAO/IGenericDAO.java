package com.tomc.sysapp.DAO;

import java.util.List;
import java.util.Optional;

public interface IGenericDAO<T> {
	
	Optional<T> readById(Long id);

	void delete(T obj);

	void create(T obj);

	List<T> read();

	void update(T t, String[] params);
}
