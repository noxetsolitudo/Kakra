package com.company.L6_14_diceGame;

import java.util.Random;

public class Operations {

    private Random random = new Random();

    private int playerWins = 0;
    private int computerWins = 0;
    private int draws = 0;
    private int rounds = 1;

    private int playerRollFunction() {
        int a = (random.nextInt(6) + 1);
        int b = (random.nextInt(6) + 1);
        return a + b;
    }

    private int computerRollFunction() {
        int a = (random.nextInt(6) + 1);
        int b = (random.nextInt(6) + 1);
        return a + b;
    }

    public void loop(int value) {
        for (int i = 1; i <= value; i++) {
            System.out.println("Zaciatok loop." + rounds++);
            int a = playerRollFunction();
            int b = computerRollFunction();
            if (a < b) {
                System.out.println("Computer won round " + i);
                computerWins++;
            } else if (a > b) {
                System.out.println("Player won round " + 1);
                playerWins++;
            } else {
                System.out.println("Draw round " + 1);
                draws++;
            }
            System.out.println("Koniec loop.");
        }
    }

    public String toString() {
        return "*************\nResults\n*************\nComputer wins: " + computerWins + "\nPlayer wins: " + playerWins + "\nDraws " + draws;
    }

    public void comparison() {
        if (computerWins > playerWins) {
            System.out.println("Computer is an overall winner!");
        } else if (computerWins < playerWins) {
            System.out.println("Player is an overall winner!");

        } else {
            System.out.println("Draw!");
        }
    }
}