package com.example.slutprojekt.model;

public class RPSBean {
   
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private int gameRounds = 0;


    public RPSBean () {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.gameRounds = 0;
    }

    public void addWin() {
        this.wins++;
    }

    public void addLoss () {
        losses++;
    }

    public void addTie () {
        ties++;
    }

    public int getWins () {
        return wins;
    }

    public int getLosses () {
        return losses;
    }

    public void addGameRound () {
        gameRounds++;
    }

    public String getGameState () {
        
        String returnJSON = "{\"wins\":\"" + wins + "\",\"losses\":\"" + losses + "\",\"ties\":\"" + ties + "\",\"rounds\":\"" + gameRounds + "\"}";
        System.out.println(returnJSON);
        return returnJSON;
    }
}