package com.tomc.sysapp.exception.impl;

import com.tomc.sysapp.exception.ISYSException;
import com.tomc.sysapp.exception.enums.ExceptionType;
import com.tomc.sysapp.exceptionhandlers.ExceptionHandlerVisitor;

public class DuplicateInstanceException extends RuntimeException implements ISYSException {

	private static final long serialVersionUID = -3436191667036006416L;
	private final ExceptionType type = ExceptionType.DUPLICATE;

	public void accept(ExceptionHandlerVisitor visitor) {
		visitor.visit(this);
	}

}
