package com.company.L6_17_tossingCoinForAdollar;

import java.util.Random;

public class CoinClass {

    private Random random = new Random();
    private int coinSide;

    public String coinToss() {
        coinSide = random.nextInt(2);
        if (coinSide == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }
}
