package com.tomc.sysapp.exception.impl;

import com.tomc.sysapp.exception.ISYSException;
import com.tomc.sysapp.exception.enums.ExceptionType;
import com.tomc.sysapp.exceptionhandlers.ExceptionHandlerVisitor;

public class InstanceNotFoundException extends RuntimeException implements ISYSException {

	private static final long serialVersionUID = 1025359978615990796L;
	private final ExceptionType type = ExceptionType.NOTFOUND;

	public void accept(ExceptionHandlerVisitor visitor) {
		visitor.visit(this);
	}

}
