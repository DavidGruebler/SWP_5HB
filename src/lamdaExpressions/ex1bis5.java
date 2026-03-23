package lamdaExpressions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ex1bis5 {
	
	
	//ex1
	Runnable r = () -> {for(int i = 1; i <= 10; i++) {System.out.println(i);}};
	
	
	//ex2
	Supplier<Integer> random = () -> { random.
	
	
	//ex3
    Consumer<String> toUpperPrinter = (s) -> System.out.println(s.toUpperCase());
    
    //ex4
    
    List<String> strings = new ArrayList<>(Arrays.asList("Apfel", "Banane", "Kiwi", "Ananas", "Ei"));
    Comparator<String> s = (a,b) -> a.compareTo(b);
    strings.sort(s);
    System.out.println(strings);
    
    //ex5
   
