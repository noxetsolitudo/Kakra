package com.company.L6_18_Fishing;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String readyOrNot = "n";
        boolean quit = false;
        int total = 0;

        Calculations calculations = new Calculations();

        System.out.println("Welcome to the BIG BIKINI BOTTOM HUNT!");

        while (!quit) {
            System.out.println("Ready to fish?\nPres 'Y' for yes and 'N' for n");
            readyOrNot = scanner.next();

            if (readyOrNot.equalsIgnoreCase("y")) {
                total += calculations.pointsFunction(calculations.options(calculations.diceThrowCalculation()));
            } else {
                quit = true;
            }
        }
        System.out.println("Your total loot is : " + total);
        System.out.println("Good bye!");


    }
}
