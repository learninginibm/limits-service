package com.learn.microservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.learn.microservice.model.ErrorResponse;


@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value = ApplicationException.class)  
	public ErrorResponse handleRunTimeException(RuntimeException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode("500");
		errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		errorResponse.setMessage(ex.getMessage());
		return errorResponse;
	}
}
