package Refacoring;

public class Rectangle extends Geometry {

	// private int id = -1; deleted 
	private double width; // deleted final
	private double height;  // deleted final

	
	public Rectangle(boolean filled, String color, double width, double height) {
		super(filled, color);
		this.width = width;
		this.height = height;
	}

	/* deleted old constuctor
	protected Rectangle(int id, double width, double height, boolean filled, String color) throws IdException {
		super(id, width, height, filled, color);

		if (width < 0 || height < 0) {
			System.out.println("Value less than zero not allowed!");
		}
		this.id = id;
		this.width = width;
		this.height = height;
	}
	*/
	
	//Generated getter and setter and check if height and width is below 0
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
	        throw new IllegalArgumentException("Width darf nicht unter 0 sein.");
	    }
	    this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
	        throw new IllegalArgumentException("Height darf nicht unter 0 sein.");
	    }
	    this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * (width + height);
	}

}
