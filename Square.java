package absractDemo_Shape;

public class Square extends Shape{
	float side;
	

	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	public Square() {
		
	}

	@Override
	void getArea() {
		
		float area=side*side;
		System.out.println("Area of Square is :"+area);
	}

	@Override
	void getParameter() {
		float parameter=4*side;
		System.out.println("Parameter of Square is :"+parameter);
		
		
	}

}
