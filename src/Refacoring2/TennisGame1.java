package Refacoring2;

public class TennisGame1 implements TennisGame {

    // geändert: sprechendere Variablennamen statt m_score1 und m_score2
    private int player1Score = 0;
    private int player2Score = 0;

    // geändert: Spielernamen bleiben erhalten
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        // geändert: Vergleich mit equals statt ==
        // geändert: echter Spielername wird verglichen
        if (player1Name.equals(playerName)) {
            player1Score++;
        } else {
            player2Score++;
        }
    }

    // geändert: Methode prüft nur noch, ob beide gleich viele Punkte haben
    public boolean equalScore() {
        return player1Score == player2Score;
    }

    // geändert: Gleichstand wurde in eigene Methode ausgelagert
    public String getEqualScoreText() {
        switch (player1Score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            default:
                return "Deuce";
        }
    }

    // geändert: eigene Methode für Advantage / Win
    public String declareWinner() {
        int scoreDifference = player1Score - player2Score;

        if (scoreDifference == 1) {
            return "Advantage player1";
        } else if (scoreDifference == -1) {
            return "Advantage player2";
        } else if (scoreDifference >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    // geändert: normale Punkteanzeige in eigene Methode ausgelagert
    public String getRunningScore() {
        String score = "";

        // geändert: player1Score statt altem m_score1
        switch (player1Score) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
        }

        score += "-";

        // geändert: player2Score statt altem m_score2
        switch (player2Score) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }

        return score;
    }

    @Override
    public String getScore() {

        // geändert: Logik in kleine Methoden aufgeteilt
        if (equalScore()) {
            return getEqualScoreText();
        }

        // geändert: prüft Endspiel-Situation
        if (player1Score >= 4 || player2Score >= 4) {
            return declareWinner();
        }

        // geändert: normale Spielstand-Anzeige ausgelagert
        return getRunningScore();
    }

    /*
    alter Code auskommentiert, weil die Methode zu lang und unübersichtlich war

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case 0:
                        score = "Love-All";
                    break;
                case 1:
                        score = "Fifteen-All";
                    break;
                case 2:
                        score = "Thirty-All";
                    break;
                default:
                        score = "Deuce";
                    break;

            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
    */

    /*
    alter fehlerhafter Zwischenstand auskommentiert, weil die Methode so nicht funktioniert hat

    public String getEqualScoreText() {
        if(equalScore()) {
            switch (player1Score) {
                case 0:
                    return "Love-All";
                case 1:
                    return "Fifteen-All";
                case 2:
                    return "Thirty-All";
                default:
                    return "Deuce";
            }
        }
    }
    */

    /*
    alter fehlerhafter Zwischenstand auskommentiert, weil void keine Strings zurückgeben darf

    public void declareWinner() {

        int scoreDifference = player1Score-player2Score;

        if (player1Score>=4 || player2Score>=4) {
            if (scoreDifference==1)
                return "Advantage player1";
            else if (scoreDifference ==-1)
                return "Advantage player2";
            else if (scoreDifference>=2)
                return "Win for player1";
            else
                return "Win for player2";
        }

    }
    */
}