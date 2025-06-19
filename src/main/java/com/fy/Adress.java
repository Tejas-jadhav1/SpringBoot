package com.fy;

public class Adress {

	private int pin;
	private String c_name;
	
	
	public Adress(int pin, String c_name) {
		super();
		this.pin = pin;
		this.c_name = c_name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "Adress [pin=" + pin + ", c_name=" + c_name + "]";
	}
	
	
	
	
	}
