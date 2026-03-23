package Refacoring;

public class Circle extends Geometry {

	//delete id
	private double radius;
	//private final boolean filled;
	//private final String color;
	//Has eneoth meaning to undersatn it 

	public Circle(boolean filled, String color, double radius) {
		super(filled, color);
		this.radius = radius;
	}
	
	/* deleted old constructor
	protected Circle(int id, double radius, boolean filled, String color) throws IdException {

		super(id, filled, color);
		if (this.id == id) {
			throw new IdException("Id must be unique!");
		}
		this.id = id;
		this.filled = filled;
		this.color = color;

		if (radius < 0) {
			System.out.println("Radius less than zero not allowed!");
		}

		this.radius = radius;
	}
	*/
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0) {
	        throw new IllegalArgumentException("Radius darf nicht unter 0 sein.");
		}
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double calculateDiameter() { //changed name to calcluate not get
		return 2 * radius;
	}

}
