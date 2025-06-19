package com.fy;

public class Student {

	private int roll;
	private String name;
	
	
	private Adress adr;


	public Student(int roll, String name,Adress adr) {
		super();
		this.roll = roll;
		this.name = name;
		this.adr = adr;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Adress getAdr() {
		return adr;
	}


	public void setAdr(Adress adr) {
		this.adr = adr;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", adr=" + adr + "]";
	}
	
	
	
	
	
	
}
