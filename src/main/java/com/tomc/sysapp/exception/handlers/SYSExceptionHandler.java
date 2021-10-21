package com.tomc.sysapp.exception.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tomc.sysapp.exception.enums.ExceptionType;
import com.tomc.sysapp.exception.impl.InstanceNotFoundException;
import com.tomc.sysapp.exception.impl.SYSException;

@ControllerAdvice
public class SYSExceptionHandler {

	@ExceptionHandler(value = InstanceNotFoundException.class)
	public ResponseEntity<SYSException> handleException(InstanceNotFoundException exception) {
		SYSException sysException = new SYSException(exception.getMessage(), exception, ExceptionType.NOTFOUND);
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		return new ResponseEntity<SYSException>(sysException, status);
	}
}
