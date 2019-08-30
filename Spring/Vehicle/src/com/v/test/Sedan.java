package com.v.test;

public class Sedan extends Car {
	String model;

	public String getModel() {
	return model;
	}

	public void setModel(String model) {
	this.model = model;
	}


	@Override
	public String toString() {
	return "Sedan [model=" + model + ", color=" + color + ", make=" + make + "]";
	}

}
