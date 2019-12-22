package com.abc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreFilter  extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub\
		//Zuul filters store request and state information in the RequestContext. We’re using
		//that to get at the HttpServletRequest
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request =  ctx.getRequest();
		request.getRequestURL();
		System.out.println("helloo"+request.getRequestURL());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
