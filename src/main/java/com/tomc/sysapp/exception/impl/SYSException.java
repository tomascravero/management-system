package com.tomc.sysapp.exception.impl;

import com.tomc.sysapp.exception.enums.ExceptionType;

public class SYSException extends Throwable {

	private static final long serialVersionUID = -359602466521864701L;
	private String message;
	private Exception cause;
	private ExceptionType type;

	public SYSException(String message, Exception cause, ExceptionType type) {
		this.message = message;
		this.cause = cause;
		this.type = type;
	}

	public SYSException(ExceptionType type) {
		this.message = type.getMessage();
		this.type = type;
		this.cause = type.getException();
	}

	public SYSException(Exception cause, ExceptionType type) {
		this.message = cause.getMessage();
		this.cause = cause;
		this.type = type;
	}

	public SYSException(Exception cause) {
		this.message = cause.getMessage();
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Exception cause) {
		this.cause = cause;
	}

	public ExceptionType getType() {
		return type;
	}

	public void setType(ExceptionType type) {
		this.type = type;
	}

}
