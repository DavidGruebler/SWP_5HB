package genericsTypebounds;

public class SortableBox<T extends Comparable<T>> {

	private T value;
	
	public SortableBox(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public int compareToOtherBox(SortableBox<T> other) {
		return this.value.compareTo(other.value);
	}
}

