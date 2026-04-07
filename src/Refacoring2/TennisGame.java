package Refacoring2;

public interface TennisGame {

    // bleibt: Punkt für Spieler vergeben
    void wonPoint(String playerName);

    // bleibt: aktuellen Spielstand zurückgeben
    String getScore();

    // geändert: neue Methoden aus dem Refactoring ins Interface aufgenommen

    // prüft ob beide Spieler gleich viele Punkte haben
    boolean equalScore();

    // gibt Text für Gleichstand zurück
    String getEqualScoreText();

    // gibt Advantage oder Gewinner zurück
    String declareWinner();

    // gibt normalen Spielstand zurück (z.B. Fifteen-Thirty)
    String getRunningScore();

}