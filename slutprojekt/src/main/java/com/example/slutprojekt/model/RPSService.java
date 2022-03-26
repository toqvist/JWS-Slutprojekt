package com.example.slutprojekt.model;

import java.util.Random;

public class RPSService {
    
    RPSBean rpsBean = new RPSBean(); 

    public String play(String choice) {

        String result = "";
        
        String playerChoice = choice;
        String opponentChoice = generateOpponentChoice();

        if (playerChoice.equals(opponentChoice)) {
            
            result = "Draw!";
        
        } else if ((playerChoice.equals("rock") && opponentChoice.equals("paper") ) ||
                (playerChoice.equals("scissors") && opponentChoice.equals("rock") ) ||
                (playerChoice.equals("paper") && opponentChoice.equals("scissors") ) ) {

            result = "Player lost!";
            System.out.println("player lost");

        } else {
            result = "Player won!";
            System.out.println("player won");
        }

        switch(result) {
        case "Player won!":
            rpsBean.addWin();
            break;
        case "Player lost!":
            rpsBean.addLoss();
            break;
        case "Draw!":
            rpsBean.addTie();
            break;
        }
        rpsBean.addGameRound();
        String gameState = "Player chose " + playerChoice + "   AI chose " + opponentChoice + "   " + result + "   Wins:" + rpsBean.getWins() + "   Losses: " + rpsBean.getLosses();
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
