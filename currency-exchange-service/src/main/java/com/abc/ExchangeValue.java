package com.abc;

public class ExchangeValue {
	
	private String from;
	private String value;
	private int port;
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getValue() {
		return value;
	}
	public ExchangeValue(String from, String value, String convValue,int port) {
		super();
		this.from = from;
		this.port = port;
		this.value = value;
		this.convValue = convValue;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConvValue() {
		return convValue;
	}
	public void setConvValue(String convValue) {
		this.convValue = convValue;
	}
	private String id;
	private String convValue;
	
	
	

}
