package com.tomc.sysapp.model.branches.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tomc.sysapp.model.branches.IBranch;
import com.tomc.sysapp.model.employee.impl.Employee;

@Entity
@Table(name = "branches")
public class Branch implements IBranch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_id")
	private long id;
	@Column(name = "first_name")
	private String name;
//	@OneToMany(mappedBy = "branch", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<Employee> employees;

	public Branch() {
		super();
	}

	public Branch(String name, List<Employee> employees) {
		super();
		this.name = name;
//		this.employees = employees;
	}

//	@Override
//	public List<Employee> getEmployees() {
//		return this.employees;
//	}

//	@Override
//	public Employee getEmployeebyId() {
//		return this.employees.get(0);
//	}

	@Override
	public String getName() {
		return this.name;
	}

}
