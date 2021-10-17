package com.tomc.sysapp.exception;

import com.tomc.sysapp.exceptionhandlers.ExceptionHandlerVisitor;

public interface ISYSException {
	void accept(ExceptionHandlerVisitor visitor);
}
