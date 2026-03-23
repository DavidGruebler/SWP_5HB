package generics;

public class PairTest {

	public static void main(String[] args) {
		
		Integer i1 = 10;
		Integer i2 = 20;
		Pair iPair = new Pair(i1,i2);
		
		Double d1 = 10.0;
		Double d2 = 20.0;
		Pair dPair = new Pair(d1,d2);
		
		Car c1 = new Car("Porsche",1000);
		Car c2 = new Car("CUBRA",200);
		Pair cPair = new Pair(c1,c2);
		System.out.println(cPair.getFirst());
		
		Car c3 = (Car) cPair.getSecond();
		
		Pair icPair = new Pair(i1,c2);
	}

}
