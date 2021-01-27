package InhertitDemo1;

enum Meterial {
	COTTON, LINEN, POLISTER;
}

public class Shirt {
	float collerSize;
	float lenght;
	static String meterial;

	public Shirt() {
		collerSize = 0.0f;
		lenght = 0.0f;
		meterial = "cotton";

	}

	public Shirt(float collerSize, float lenght, String meterial) {
		super();
		this.collerSize = collerSize;
		this.lenght = lenght;
		this.meterial = meterial;
	}

	public float getCollerSize() {
		return collerSize;
	}

	public void setCollerSize(float collerSize) {
		this.collerSize = collerSize;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public String getMeterial() {
		return meterial;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}

	void displayDetails() {
		System.out.println("Shirt [collerSize=" + collerSize + ", lenght=" + lenght + ", meterial=" + meterial + "]");

	}

	@Override
	public String toString() {
		return "Shirt [collerSize=" + collerSize + ", lenght=" + lenght + ", meterial=" + meterial + "]";
	}

}
