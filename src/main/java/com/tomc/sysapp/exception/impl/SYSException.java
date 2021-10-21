package com.tomc.sysapp.exception.impl;

import com.tomc.sysapp.exception.enums.ExceptionType;

public class SYSException extends Exception {

	private static final long serialVersionUID = -359602466521864701L;
	private ExceptionType type;

	public SYSException(String message, Throwable cause, ExceptionType type) {
		super(message, cause);
		this.type = type;
	}

}
