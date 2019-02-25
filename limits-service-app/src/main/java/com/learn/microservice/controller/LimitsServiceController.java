package com.learn.microservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservice.config.Loggable;
import com.learn.microservice.exception.ApplicationException;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Loggable
public class LimitsServiceController implements ILimitsServiceController {

	@Autowired
	MessageSource messageSource;
	
	public Map<String, Object> getAllMessages() {
		log.info("getAllMessages started");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", "A");
		map.put("2", "Z");
		map.put("3", "B");
		map.put("4", "C");
		return map;
	}

	public Map<String, Object> getAParticularMessage(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("2", "Z");
		map.put("1", "A");
		map.put("3", "B");
		map.put("4", "C");
		if(map.get(id).equals("Z")) {
			throw new ApplicationException("Not a valid input Id");
		}
		return map;
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return messageSource.getMessage("msg.hello", null, LocaleContextHolder.getLocale());
	}
}
