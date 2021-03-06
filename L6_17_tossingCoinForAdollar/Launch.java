package com.company.L6_17_tossingCoinForAdollar;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Launch {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        boolean quit = false;
        String toQuit = "y";
        boolean yesNoToss = true;
        double total = 0;
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        TossingForAdollar tossing = new TossingForAdollar();

        outerloop:

        while (!quit) {

            System.out.println("Toss no. " + counter++);
            total += tossing.calculation();

//            tossing.coinTossDime();//TODO suvisi s // v TossingForAdollar
//            tossing.coinTossNickel();

            System.out.println(decimalFormat.format(total));

            if (total == 1.0) {
                System.out.println("Congratulation, you WON!");
            } else if (total > 1.0) {
                System.out.println("You lost because sum of all tosses exceeded $1");
                quit = true;
                break outerloop;


            } else {
                System.out.println("Not there just yet! ;)");
            }

            System.out.println("Would you like to continue? Press Y for yes, N for no.");
            toQuit = scanner.next();
            if (toQuit.equalsIgnoreCase("y")) {
                quit = false;
            } else {
                quit = true;
            }
        }
        System.out.println("You earned " + decimalFormat.format(total));
        System.out.println("Good bye!");
    }
}
