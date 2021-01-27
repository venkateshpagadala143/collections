package com.ojas.cirlcle;

public class Cylender extends Circle {
	double hight;

	public Cylender(double radius, double hight) {
		super(radius);
		this.hight = hight;
	}
	public Cylender() {
	
	}
	double getVolume() {
		double volume=3.141*radius*radius*hight;
		return volume;
	}
	

}
