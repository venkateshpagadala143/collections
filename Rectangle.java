package absractDemo_Shape;

public class Rectangle extends Shape {
	float length;
	float breadth;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		
	}

	@Override
	void getArea() {
		float area=length*breadth;
		System.out.println("Area of Rectangular is :"+area);
		
		
	}

	@Override
	void getParameter() {
		float patameter=2*(length+breadth);
		System.out.println("Parameter of Rectangular is :"+patameter);
		
		
	}

}
