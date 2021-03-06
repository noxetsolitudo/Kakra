package com.company.L6_16_coinToss;

import java.util.Random;

public class Toss {

    Random random = new Random();

    private int counterHeads;
    private int counterTails;
    private int loopCounter = 0;

    private String tossFunction() {
        int oneSide = random.nextInt(2);
        if (oneSide == 0) {
            counterHeads++;
            return "Heads";
        } else {
            counterTails++;
            return "Tails";
        }
    }

    public void loop(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println("Coin toss: " + tossFunction());
            loopCounter++;
        }
    }

    public String toString() {
        return "The number of heads is: " + counterHeads +
                "\nThe number of tails is: " + counterTails +
                "\nin " + loopCounter + " rounds";
    }

}
