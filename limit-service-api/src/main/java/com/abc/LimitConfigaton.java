package com.abc;

public class LimitConfigaton {

	public LimitConfigaton(int min, int max) {
		super();
		this.max = max;
		this.min = min;
	}
	private int max;
	private int min;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
}
