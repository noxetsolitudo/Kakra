package com.company.L5_15;

import java.util.Random;

public class Run {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber;
        int evenCounter = 0;
        int oddcounter = 0;


        OddEven oddEven = new OddEven();

        for (int i = 0; i <= 990; i++) {
            randomNumber = random.nextInt((1000 - 0)) + 0 - 1;
            System.out.println(randomNumber);
            if (oddEven.isEven(randomNumber)) {
                evenCounter +=1;
            }else{
                oddcounter +=1;
            }
        }

        System.out.println("Total even numbers: " + evenCounter);
        System.out.println("Total odd numbers: " + oddcounter);

    }
}
