package Refacoring2;

public class TennisMatch implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisMatch(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    @Override
    public void wonPoint(String playerName) {
        if (player1.getName().equals(playerName)) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    @Override
    public boolean equalScore() {
        return player1.getScore() == player2.getScore();
    }

    @Override
    public String getEqualScoreText() {
        switch (player1.getScore()) {
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

    @Override
    public String declareWinner() {
        int scoreDifference = player1.getScore() - player2.getScore();

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

    @Override
    public String getRunningScore() {
        return player1.getTennisPointName() + "-" + player2.getTennisPointName();
    }

    @Override
    public String getScore() {
        if (equalScore()) {
            return getEqualScoreText();
        }

        if (player1.getScore() >= 4 || player2.getScore() >= 4) {
            return declareWinner();
        }

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