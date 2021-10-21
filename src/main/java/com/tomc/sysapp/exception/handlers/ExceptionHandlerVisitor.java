package com.tomc.sysapp.exception.handlers;

import com.tomc.sysapp.exception.impl.DuplicateInstanceException;
import com.tomc.sysapp.exception.impl.InstanceNotFoundException;

public class ExceptionHandlerVisitor {

	public void visit(InstanceNotFoundException exception) {
	}

	public void visit(DuplicateInstanceException exception) {
	}
}
