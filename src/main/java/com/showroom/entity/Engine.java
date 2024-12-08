package com.showroom.entity;

public class Engine {
	private String model;
	private String capacity;
	
	public Engine() {
		
	}
	
	public Engine(String model, String capacity) {
		super();
		this.model = model;
		this.capacity = capacity;
	}

	public Engine(String string, int i) {
		
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	

}
