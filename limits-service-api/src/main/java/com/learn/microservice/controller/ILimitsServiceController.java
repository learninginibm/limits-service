package com.learn.microservice.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface ILimitsServiceController{
	
	@GetMapping("/messages")
	public Map<String, Object> getAllMessages();
	
	@GetMapping("/messages/{id}")
	public Map<String, Object> getAParticularMessage(@PathVariable("id") String id);
}
