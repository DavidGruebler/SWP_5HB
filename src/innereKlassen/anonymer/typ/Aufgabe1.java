package innereKlassen.anonymer.typ;

public class Aufgabe1 {
	
    public static void main(String[] args) {

  
        Runnable r = new Runnable() { // interface Runnable
        	public void run() {
        		for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
        		}
        	}
        };
        
        Thread t = new Thread(r);	//public class Thread
        							//extends Object 
        							//implements Runnable
        
        t.start();	// oracle: Veranlasst dazu, dass dieser Thread ausgeführt wird;
        			//die Java Virtual Machine ruft die runMethode dieses Threads auf.
    }
}