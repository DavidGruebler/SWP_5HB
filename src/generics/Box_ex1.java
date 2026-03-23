package generics;

public class Box_ex1<T> {
	
	private T value;
	
	public Box_ex1(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
