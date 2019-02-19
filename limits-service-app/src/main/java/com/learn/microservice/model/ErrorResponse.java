package com.learn.microservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	private String code;
	private String message;
	private String status;
}
