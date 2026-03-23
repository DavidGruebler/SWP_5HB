package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {
    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public List<T> getElements() {
        return elements;
    }

    public static double sumItems(Container<? extends Number> container) {
        double sum = 0;
        for (Number num : container.getElements()) {
            sum += num.doubleValue();
        }
        return sum;   
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        intContainer.add(10);
        intContainer.add(20);
        intContainer.add(30);

        System.out.println("Summe der Integer-Box: " + Container.sumItems(intContainer));  // 60.0
    }
}
