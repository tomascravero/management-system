package com.tomc.sysapp.exception.enums;

import com.tomc.sysapp.exception.impl.DuplicateInstanceException;
import com.tomc.sysapp.exception.impl.InstanceNotFoundException;

public enum ExceptionType {
	DUPLICATE("Duplicated Instance"), NOTFOUND("Instance Not Found"), UNDEFINED("Undefined Error");

	private String message;

	private ExceptionType(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public Exception getException() {
		switch (this) {
		case DUPLICATE:
			return new DuplicateInstanceException();
		case NOTFOUND:
			return new InstanceNotFoundException();
		case UNDEFINED:
		default:
			return new Exception();
		}
	}
}
