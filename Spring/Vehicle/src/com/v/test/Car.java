package com.v.test;

public class Car {
	String color;
	String make;
	public String getColor() {
	return color;
	}
	public void setColor(String color) {
	this.color = color;
	}
	public String getMake() {
	return make;
	}
	public void setMake(String make) {
	this.make = make;
	}
	@Override
	public String toString() {
	return "Car [color=" + color + ", make=" + make + "]";
	}

}
