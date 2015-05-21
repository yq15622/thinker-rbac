package com.github.slowrookie.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/hello")
	public Map<String, String> hello() {
		Map<String, String> result = new HashMap<>();
		result.put("hello", "world!");     
		return result;
	}
	
}
