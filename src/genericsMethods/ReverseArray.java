package genericsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	
	public static <T> List<T> reverseArray(T[] array) {
	    List<T> list = new ArrayList<>(Arrays.asList(array));
	    Collections.reverse(list);
	    return list;
	}
	
	public static <T extends Comparable<T>> T findMin(T a, T b) {
	        return (a.compareTo(b) < 0) ? a : b;
	    }
		
	 public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
		 int count = 0;
		 for(T a : array) {
			if(element.compareTo(a) < 0) {
				count++;
			}
		 }
		 return count;
	 }
	
	 
	public static void main(String[] args) {
		  
		//ex1
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println(reverseArray(intArray));

        String[] stringArray = {"A", "B", "C"};
        System.out.println(reverseArray(stringArray));
		
        //ex2
        System.out.println(findMin(15, 10));      // Ausgabe: 10
        System.out.println(findMin("Dog", "Cat")); // Ausgabe: Cat
        
        //ex3
        Integer[] numbers = {1, 3, 5, 7, 9};
        System.out.println(countGreaterThan(numbers, 4));
        
	}

}
