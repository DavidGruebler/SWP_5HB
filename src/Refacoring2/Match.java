package Refacoring2;

public class Match {

    public static void main(String[] args) {

        Player player1 = new Player("Nevio");
        Player player2 = new Player("David");

        TennisMatch game = new TennisMatch(player1.getName(), player2.getName());

        game.wonPoint(player1.getName()); // 15-0
        game.wonPoint(player2.getName()); // 15-15
        game.wonPoint(player1.getName()); // 30-15
        game.wonPoint(player2.getName()); // 30-30
        game.wonPoint(player1.getName()); // 40-30

        System.out.println("Aktueller Spielstand: " + game.getScore());

        game.wonPoint(player1.getName()); //Win for player1

        System.out.println("Endstand: "+game.getScore());
    }
}