package com.showroom.entity;

public class Vehicle {
	private String vno;;
	private String name;
	private Engine engine;
	
	public Vehicle() {
	}

	public Vehicle(String vno, String name, Engine engine) {
		super();
		this.vno = vno;
		this.name = name;
		this.engine = engine;
	}

	public String getVno() {
		return vno;
	}
	public void setVno(String vno) {
		this.vno = vno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}


