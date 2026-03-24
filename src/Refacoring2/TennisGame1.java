package Refacoring2;

public class TennisGame1 implements TennisGame {

    // geändert: sprechendere Variablennamen
    private int player1Score = 0;
    private int player2Score = 0;

    private String player1Name;
    private String player2Name;
    
    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        // Verwenden von equals und nicht ==
        if ("player1".equals(playerName)) {
            player1Score++;
        } else {
            player2Score++;
        }
    }
    
    //Mathe zum vergleichen des scores
    public boolean equalScore() {
    	if(player1Score==player2Score) {
    		return true;
    	}
    	return false;
    }
    
    // Das Anzeigen des Textes für die verschiedenen Pukte in eine eigene Mathode
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
    
    public String declareWinner() {
    	
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
    
    //long method: Inhalt in andere Methode übertragen
    /*
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
}