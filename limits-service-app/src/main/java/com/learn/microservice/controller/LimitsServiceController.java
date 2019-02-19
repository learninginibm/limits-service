package com.learn.microservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.learn.microservice.exception.ApplicationException;

@RestController
public class LimitsServiceController implements ILimitsServiceController {

	public Map<String, Object> getAllMessages() {
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

}
