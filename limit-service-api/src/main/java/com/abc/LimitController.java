package com.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping
	public LimitConfigaton get() {
		
		return new LimitConfigaton(configuration.getMin(),configuration.getMax());
	}
	
	
}

