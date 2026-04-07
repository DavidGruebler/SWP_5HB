package Refacoring2;

public interface TennisGame {

    void wonPoint(String playerName);
    String getScore();
    boolean equalScore();
    String getEqualScoreText();
    String declareWinner();
    String getRunningScore();
}