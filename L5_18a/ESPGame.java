package com.company.L5_18a;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    private Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int randomNumber;
    private String randomColour;
    private String usersChoice;
    private int correctCounter = 0;
    private int incorrectCounter = 0;

    public void loop(){
        for (int i = 0; i < 3; i++) {
           colourGenerator();
           question();
           comparison();

        }
        totals();
        scannerClose();
    }

    private void colourGenerator() {
        randomNumber = random.nextInt(((4 - 0) + 1) - 0);
//        System.out.println(randomNumber);
        switch (randomNumber) {
            case 0:
                randomColour = "Red";
                break;
            case 1:
                randomColour = "Green";
                break;
            case 2:
                randomColour = "Blue";
                break;
            case 3:
                randomColour = "Orange";
                break;
            case 4:
                randomColour = "Yellow";
                break;
        }
//        System.out.println(randomColour);
    }

    private void question() {
        System.out.println("I have choosen the colour, please type your guess now:");
        usersChoice = scanner.next();
    }

    private void comparison() {
        if (usersChoice.equalsIgnoreCase(randomColour)) {
            System.out.println("Correct, your guess was spot on, my choice was " + randomColour + ".\n");
            correctCounter += 1;
        } else {
            System.out.println("Incorrect, your quess was wrong, my choice was " + randomColour + ".\n");
            incorrectCounter += 1;
        }
    }

    private void totals(){
        System.out.println("Correct answers: " + correctCounter);
        System.out.println("Incorrect answers: " + incorrectCounter);
    }

    private void scannerClose(){
        scanner.close();
    }

}
