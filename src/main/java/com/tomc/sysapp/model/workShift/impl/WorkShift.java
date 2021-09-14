package com.tomc.sysapp.model.workShift.impl;

import com.tomc.sysapp.model.branches.impl.Branch;
import com.tomc.sysapp.model.employee.impl.Employee;
import com.tomc.sysapp.model.workShift.IWorkShift;

public class WorkShift implements IWorkShift {

	private Employee employee;
	private Branch branch;
	// TODO Agregar fields para:
	// - Horario de entrada
	// - Horario de salida
	// - Horas trabajadas
	// - Bonus? Esto debería ir por empleado?
}
