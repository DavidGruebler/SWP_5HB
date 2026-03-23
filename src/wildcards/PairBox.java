package wildcards;

public class PairBox <T, U>{
	
	private T box1;
	private U box2;
	
	public PairBox(T box1, U box2) {
		super();
		this.box1 = box1;
		this.box2 = box2;
	}

	public T getBox1() {
		return box1;
	}
	
	public U getBox2() {
		return box2;
	}
	
	public boolean compareFirst(PairBox<? extends Comparable<? super T>,?> other) {
        // Compare the first values using the compareTo method
        return this.box1.compareTo(other.getBox1()) == 0;
    }
	
	

}
