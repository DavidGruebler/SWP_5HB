package generics;

public class Triple<T, U, V> {
	private final T frist;
	private final U second;
	private final V third;
	
	
	public Triple(T fist, U second, V third) {
		this.frist = fist;
		this.second = second;
		this.third = third;
	}

	public T getFist() {
		return frist;
	}


	public U getSecond() {
		return second;
	}


	public V getThird() {
		return third;
	}

	@Override
	public String toString() {
		return "Triple [fist=" + frist + ", second=" + second + ", third=" + third + "]";
	}
}
