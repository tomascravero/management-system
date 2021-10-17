package com.tomc.sysapp.exceptionhandlers;

import com.tomc.sysapp.exception.enums.ExceptionType;
import com.tomc.sysapp.exception.impl.SYSException;

public class ExceptionHandler {

	private ExceptionHandlerVisitor visitor;

	void manageException(SYSException exception) {
		ExceptionType type = exception.getType();
	}
}
