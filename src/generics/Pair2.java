package generics;

public class Pair2<T, U> {
	
	private final T first;
	private final U second;
	
	public Pair2(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}

	 public Pair2<U, T> swap() {
	        return new Pair2<>(this.getSecond(), this.getFirst());
	    }
	

}
