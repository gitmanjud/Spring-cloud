package com.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyExchangeRest {
	
	@Autowired
private Environment env;
	
	@GetMapping("exchange/from/{from}/to/{to}")
	public ExchangeValue getExchange(@PathVariable String from ,@PathVariable String to) {
		
		env.getProperty("local.server.port");
		
		return new ExchangeValue(from,to,"3",Integer.parseInt(env.getProperty("local.server.port")));
		
	}

}
