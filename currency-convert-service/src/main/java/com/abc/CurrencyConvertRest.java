package com.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CurrencyConvertRest {

	@Autowired
private Environment env;
	
	@Autowired
	private ICurrencyExchangeService iCurrencyExchangeService;

	@GetMapping("convert/from/{from}/to/{to}/quatity/{quatity}")
	public ConvertExchangeValue getExchange(@PathVariable String from ,@PathVariable String to,@PathVariable String quatity) {
		
		env.getProperty("local.server.port");
		
		return new ConvertExchangeValue(from,to,Integer.parseInt(env.getProperty("local.server.port")),"ad","sd",quatity);
		
	}
	
	@HystrixCommand(fallbackMethod="test")
	@GetMapping("convert-feign/from/{from}/to/{to}/quatity/{quatity}")
	public ConvertExchangeValue getExchangeFeign(@PathVariable String from ,@PathVariable String to,@PathVariable String quatity) {
		
		env.getProperty("local.server.port");
		
		ExchangeValue exchangeValue = iCurrencyExchangeService.getExchange(from, to);
		
		return new ConvertExchangeValue(exchangeValue.getFrom(),to,exchangeValue.getPort(),"ad","sd",quatity);
		
	}
	public ConvertExchangeValue test( String from , String to,String quatity) {
		
		return new ConvertExchangeValue("te","dsa",12,"ad","sd","sd");
		 
		
	}


}
