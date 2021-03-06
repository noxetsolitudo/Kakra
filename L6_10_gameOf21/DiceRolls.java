package com.company.L6_10_gameOf21;

import java.util.Random;

public class DiceRolls {

    Random random = new Random();

    private int player01Throw =0;
    private int player02Throw =0;

    public int player1ThrowCalculation(){
       return player01Throw = ((random.nextInt(6)+1)) + ((random.nextInt(6)+1));
    }

    public int player2ThrowCalculation(){
        return player02Throw = ((random.nextInt(6)+1)) + ((random.nextInt(6)+1));
    }

    public void list(){
        System.out.println(player1ThrowCalculation());
        System.out.println(player2ThrowCalculation());
    }
}