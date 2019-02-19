package com.learn.microservice.exception;

public class ApplicationException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8822489869040784782L;

	public ApplicationException(String message) {
		super(message);
	}
}
