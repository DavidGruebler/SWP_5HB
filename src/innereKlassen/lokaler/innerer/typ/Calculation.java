package innereKlassen.lokaler.innerer.typ;

public class Calculation {

    public static void calculateAverage(int[] numbers) {

        class DurchschnittsBerechner {
            
            public double berechne() {
            	double summe = 0;
                double count = 0;
                for (int n : numbers) {
                    summe += n;
                    count++;
                }
                return summe / count; 
            }
        }

        DurchschnittsBerechner db = new DurchschnittsBerechner();

        double average = db.berechne(); //Durchschnitt berechen

        System.out.println("Der Durchschnitt ist: " + average);
    }

    public static void main(String[] args) {
        int[] werte = {4, 8, 15, 16, 23, 42};
        calculateAverage(werte);
    }
}

//Lösung:

//public class DurchschnittsBerechnung {
//
//    public static void berechneDurchschnitt(int[] zahlen) {
//        class DurchschnittsBerechner {
//            public double berechne() {
//                int summe = 0;
//                for (int zahl : zahlen) {
//                    summe += zahl;
//                }
//                return (double) summe / zahlen.length;
//            }
//        }
//
//        DurchschnittsBerechner berechner = new DurchschnittsBerechner();
//        System.out.println("Durchschnitt: " + berechner.berechne());
//    }
//
//    public static void main(String[] args) {
//        int[] zahlen = {10, 20, 30, 40};
//        berechneDurchschnitt(zahlen);
//    }
//}
 
