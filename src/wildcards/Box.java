package wildcards;

public class Box<T extends Comparable<T>>{
	
	 private T value;
	
	 public Box(T value) {
	     this.value = value;
	 }
	
	 public T getValue() {
	     return value;
	 }
	
	 public  int compareBoxes(Box<?> box) {
	     return this.value.compareTo((T) box.getValue());
	 }
	
	 /*
	  * public static boolean compareBoxes(Box<?> box1, Box<?> box2) {
        if (box1.getValue() == null && box2.getValue() == null) {
            return true;
        }
        if (box1.getValue() == null || box2.getValue() == null) {
            return false;
        }
        return box1.getValue().equals(box2.getValue());
    	} 
	  * 
	  */
	 
	 public static void main(String[] args) {
	     Box<Integer> intBox1 = new Box<>(10);
	     Box<Integer> intBox2 = new Box<>(10);
	     Box<String> strBox = new Box<>("10");
	
	     System.out.println("Vergleich intBox1 und intBox2: " + intBox1.compareBoxes(intBox2)); // true
	     System.out.println("Vergleich intBox1 und strBox: " + intBox2.compareBoxes(strBox));   // false
	 }
	}


