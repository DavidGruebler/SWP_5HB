package Refacoring;

import java.util.UUID;

// changed class to abstract
public abstract class Geometry implements Comparable<Geometry> {
	private UUID id;  //changed from -1 to nothing and to the type UUID
	private boolean filled; //changed from false to nothing
	private String color; //changed from "" to nothing
	
	/* Only the attributes that are used in all the subclasses
	private double width; //changed from 0 to nothing
	private double height; //changed from 0 to nothing
	*/
	
	/* deleted
	
		public Geometry() {
		}
	*/
	
	/* deleted and added new constructor
	public Geometry(int id, boolean filled, String color) throws IdException {

		if (this.id == id) {
			throw new IdException("Id must be unique!");
		}
		this.id = id;
		this.filled = filled;
		this.color = color;
	}

	protected Geometry(int id, double width, double height, boolean filled, String color) throws IdException {
		if (this.id == id) {
			throw new IdException("Id must be unique!");
		}
		this.id = id;
		this.width = width;
		this.height = height;
		this.filled = filled;
		this.color = color;
	}
	*/
	
	//imported the right constructor
	public Geometry(boolean filled, String color) {
		this.id = UUID.randomUUID(); //changed to UUID random
		this.filled = filled;
		this.color = color;

	}
	
	public String getColor() {
		return color;
	}

	public UUID getId() {
		return id;
	}

	public boolean isFilled() {
		return filled;
	}
	
	//changed methods to abstract
	public abstract double calculateArea();
	//changed methods to abstract
	public abstract double calculatePerimeter();  //changed name to calcluate not get and made them abstract

	@Override
	public int compareTo(Geometry c) {
		if (this.calculateArea() > c.calculateArea())
			return 1;
		else if (this.calculateArea() < c.calculateArea())
			return -1;
		else
			return 0;
	}
}
