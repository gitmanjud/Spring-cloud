package com.abc;

public class ConvertExchangeValue {

	private String from;
	private String value;
	private int port;
	private String quantity;
	private String id;
	private String totalAmount;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public ConvertExchangeValue(String from, String value, int port, String quantity, String id, String totalAmount) {
		super();
		this.from = from;
		this.value = value;
		this.port = port;
		this.quantity = quantity;
		this.id = id;
		this.totalAmount = totalAmount;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
}
