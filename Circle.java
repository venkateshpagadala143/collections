package com.ojas.cirlcle;

public class Circle {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		
	}
	double getArea(){
		if(radius<1) {
			return -1;
		}else {
		double area=2*3.141*radius;
		return area;
		}
	}

}
