package com.tomc.sysapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomc.sysapp.model.employee.impl.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
