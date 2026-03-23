package innereKlassen.statisch.geschachtelter.innerer.typ;

public class Mathematics {

	public static class Factorial{
		
		public static int berechne(int n) {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
	        }

	            return result;		        
		}
	}	
	
	
	public static void main(String[] args) {
		 System.out.println("Fakultät von 3 = " + Factorial.berechne(3));
	}
}
