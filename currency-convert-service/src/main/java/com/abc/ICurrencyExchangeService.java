package com.abc;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

//@FeignClient(name="currency-exchange-service",url="localhost:8091")

//@FeignClient(name="currency-exchange-service")//(name="http://currency-exchange-service")//our proj
@RibbonClient(name="currency-exchange-service")
//need to chck issue
@FeignClient(name="gateway")
public interface ICurrencyExchangeService {
	
	@GetMapping("currency/exchange/from/{from}/to/{to}")
	public ExchangeValue getExchange(@PathVariable String from ,@PathVariable String to);

	
	
	
}
