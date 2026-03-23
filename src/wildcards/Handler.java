package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Handler<T> {
	
    private T value;

    public Handler(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void addItems(List<? super T> list) {
        list.add(value);
    }

    
    
	public static void main(String[] args) {
	
        Handler<Integer> intHandler = new Handler<>(1);
        
        List<Number> numberList = new ArrayList<>();
        intHandler.addItems(numberList);

        List<Object> objectList = new ArrayList<>();
        intHandler.addItems(objectList);

        System.out.println("Number-Liste: " + numberList);
        System.out.println("Object-Liste: " + objectList);
        
	}

}
