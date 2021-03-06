package com.company.L5_17_rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private boolean gameQuit = false;
    private String yesNo = "n";
    private int computerGener;
    private int playerPick;
    private int playerWins = 0;
    private int computerWins = 0;
    private int roundsCounter = 0;

    public void gameStart() {

        System.out.println("Would you like to start the game?\nPress Y for yes and N for no.");
        yesNo = scanner.next();

        while (!gameQuit && yesNo.equalsIgnoreCase("y")) {

            System.out.println("Computer has picked.");
            computerGener = random.nextInt(3);

            System.out.println("Player's turn now.\nPlease enter '0' for rock, '1' for paper or '2' for scissors.");
            playerPick = scanner.nextInt();
            while (playerPick != 0 && playerPick != 1 && playerPick != 2) {
                System.out.println("Error while entering the appropriate numbers, please enter '0' for rock, '1' for paper or '2' for scissors.");
                playerPick = scanner.nextInt();
            }

            pickings(computerGener, "Computer");
            scanner.nextLine();
            pickings(playerPick, "Player");
            roundsCounter++;

            conditions();

            System.out.println("Would you like to play another round?\nPress Y to continue, press N to quit.");
            yesNo = scanner.next();
            if (yesNo.equalsIgnoreCase("n")) {
                gameQuit = true;
            }
        }
    }

    public void results() {
        System.out.println("Game resutls:\n--------------\n" + "Player: " + playerWins + "\nComputer: " + computerWins + "\nNumber of rounds: " + roundsCounter);
    }

    public void pickings(int value, String who) {

        switch (value) {
            case 0:
                System.out.println(who + " has chosen Rock.");
                break;
            case 1:
                System.out.println(who + " has chosen Paper.");
                break;
            case 2:
                System.out.println(who + " has chosen Scissors.");
                break;
        }
    }

    private void conditions() {
        if (!gameQuit) {
            if (computerGener == 0 && playerPick == 2) {
                System.out.println("Rock beats scissors, computer wins!");
                computerWins++;
            } else if (playerPick == 0 && computerGener == 2) {
                System.out.println("Rock beats scissors, player wins!");
                playerWins++;
            } else if (computerGener == 1 && playerPick == 0) {
                System.out.println("Paper beats Rock, computer wins!");
                computerWins++;
            } else if (playerPick == 1 && computerGener == 0) {
                System.out.println("Paper beats Rock, player wins!");
                playerWins++;
            } else if (computerGener == 2 && playerPick == 1) {
                System.out.println("Scissors beats Paper, computer wins!");
                computerWins++;
            } else if (playerPick == 2 && computerGener == 1) {
                System.out.println("Scissors beats Paper, player wins!");
                playerWins++;
            } else {
                System.out.println("You have chosen the same, draw!");
            }
        }
    }

    public void scannerClose() {
        scanner.close();
    }
}


