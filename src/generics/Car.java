package generics;

public class Car {
	
	private String name;
	private int ps;
	
	public Car(String name, int ps) {
		this.name = name;
		this.ps = ps;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", ps=" + ps + "]";
	}
	

}
