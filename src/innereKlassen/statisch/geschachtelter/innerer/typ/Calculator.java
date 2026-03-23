package innereKlassen.statisch.geschachtelter.innerer.typ;

public class Calculator {

    public static class Addition {
    	
    
        public int add(int a, int b) {
            return a + b;
        }
    }
    
    public static void main(String[] args) {
        Addition addition = new Calculator.Addition();
        System.out.println(addition.add(2, 3));

    }
}