package com.example.slutprojekt.model;

import java.util.Random;

public class RPSService {
    
    RPSBean rpsBean = new RPSBean(); 

    public String play(String choice) {

        String result = "";
        
        String playerChoice = choice;
        String opponentChoice = generateOpponentChoice();

        if (playerChoice.equals(opponentChoice)) {
            
            result = "draw";
        
        } else if ((playerChoice.equals("rock") && opponentChoice.equals("paper") ) ||
                (playerChoice.equals("scissors") && opponentChoice.equals("rock") ) ||
                (playerChoice.equals("paper") && opponentChoice.equals("scissors") ) ) {

            result = "computer";
            System.out.println("player lost");

        } else {
            result = "player";
            System.out.println("player won");
        }

        switch(result) {
        case "player":
            rpsBean.addWin();
            break;
        case "computer":
            rpsBean.addLoss();
            break;
        case "draw":
            rpsBean.addTie();
            break;
        }
        rpsBean.addGameRound();
        //{ "Computer move": value, "Winner": value }  
        
        //String gameState = "Player chose " + playerChoice + "   AI chose " + opponentChoice + "   " + result + "   Wins:" + rpsBean.getWins() + "   Losses: " + rpsBean.getLosses();

        String gameState = "{\"Computer move\":\"" + opponentChoice  + "\",\"Winner\":\"" + result +"\"}";

        //String gameState = "Computer move: " + opponentChoice + "playerChoice: "
        return gameState;
    }

    private String generateOpponentChoice() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println(randomNumber);

        String returnString = "";

        switch (randomNumber) {
            case 0:
                returnString = "rock";
                break;
            case 1:
                returnString = "paper";
                break;
            case 2:
                returnString = "scissors";
                break;
        }
        return returnString;
    }

    public String getGameState() {
        String gameState = rpsBean.getGameState();
        return gameState;
    }
}
