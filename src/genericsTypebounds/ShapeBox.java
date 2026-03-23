package genericsTypebounds;


public class ShapeBox<T extends Shape> {
    
	private T shape;

	public ShapeBox(T shape) {
		super();
		this.shape = shape;
	}

	public T getShape() {
		return shape;
	}

	public void setShape(T shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		this.shape.draw();
	}
	
	
}