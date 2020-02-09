package com.example.microservices.spring.limitsservice.bean;

public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	
	
	
	protected LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.maximum=maximum;
		this.minimum=minimum;
		
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
