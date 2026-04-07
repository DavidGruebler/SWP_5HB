package Refacoring2;

public class Player {

    private String name;
    private int score;

    // geändert: Array jetzt im Player, weil es zum Score gehört
    private String[] tennisPoints = {"Love", "Fifteen", "Thirty", "Forty"};

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void wonPoint() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String getTennisPointName() {
        if (this.score <= 3) {
            return tennisPoints[this.score];
        }

        return null;
    }
}