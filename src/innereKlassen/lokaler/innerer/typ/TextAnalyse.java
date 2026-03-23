package innereKlassen.lokaler.innerer.typ;

public class TextAnalyse {

    public static void analyseText(String text) {
    	
    	 class TextStatistic {
             int words() {
                 return text.split(" ").length; //split teilt jede stelle wo ein leerzeichen ist und gibt es in einem Array aus
                 								//.length gibt dann einfach die länge des arrays zurück
             }

             int zeichen() {
                 return text.replace(" ", "").length();
             }
         }

        TextStatistic stats = new TextStatistic();

        
        System.out.println("Wörter: " + stats.words());
        System.out.println("Zeichen: " + stats.zeichen());
    }

    public static void main(String[] args) {
        analyseText("HTL-Schüler lernen Java");
    }
}
