package Refacoring2;

public class Match {

    public static void main(String[] args) {

        // geändert: Spiel wird erstellt mit zwei Spielernamen
        TennisGame1 game = new TennisGame1("player1", "player2");

        // geändert: Punkte werden vergeben
        game.wonPoint("player1"); // 15-0
        game.wonPoint("player2"); // 15-15
        game.wonPoint("player1"); // 30-15
        game.wonPoint("player1"); // 40-15
        game.wonPoint("player2"); // 40-30

        // geändert: aktueller Spielstand wird ausgegeben
        System.out.println("Aktueller Spielstand: " + game.getScore());

        // weitere Punkte für Sieg testen
        game.wonPoint("player1"); // Sieg Spieler 1

        // geändert: Endstand wird ausgegeben
        System.out.println("Endstand: " + game.getScore());
    }
}