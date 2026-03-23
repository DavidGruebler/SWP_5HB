package generics;

public class Pair2_test {
	
    public static void main(String[] args) {
 
        Pair2<String, Integer> pair = new Pair2<>("Hallo", 42);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        
        Pair2<Integer, String> pairSwap = pair.swap();
        System.out.println(pairSwap.getFirst());
        System.out.println(pairSwap.getSecond());
    }
}

