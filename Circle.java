package absractDemo_Shape;

public class Circle extends Shape {
	float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public Circle() {

	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	void getArea() {
		float area=(22/7)*(radius*radius);
		System.out.println("Area of Circle is : "+area);

	}

	@Override
	void getParameter() {
		float parameter=2*(22/7)*radius;
		System.out.println("Parameter of Circle is : "+parameter);
		

	}

}
