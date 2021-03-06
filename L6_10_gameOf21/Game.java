package com.company.L6_10_gameOf21;

import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);

    public DiceRolls diceRolls = new DiceRolls();


    private String name1;
    private String name2;

    private String decision = "n";
    private int round = 0;
    private int player1Sum = 0;
    private int player2Sum = 0;
    private int player1DiceRoll = 0;
    private int player2DiceRoll = 0;

    public void game() {
        System.out.println("      *        ");
        System.out.println("     ***       ");
        System.out.println("    *****      ");
        System.out.println("   *******     ");
        System.out.println("  *********    ");
        System.out.println("The GAME of 21!");
        System.out.println("  *********    ");
        System.out.println("   *******     ");
        System.out.println("    *****      ");
        System.out.println("     ***       ");
        System.out.println("      *        ");

        System.out.println("Please enter your name Player 1: ");
        name1 = scanner.next();
        System.out.println("Please enter your name Player 2: ");
        name2 = scanner.next();


        while (player1Sum <= 21 && player2Sum <= 21) {

            if (player1Sum <= 21) {
                System.out.println(name1 + ", would you like to throw?");
                decision = scanner.next();
                if (decision.equalsIgnoreCase("y")) {
                    player1DiceRoll = diceRolls.player1ThrowCalculation();
                    player1Sum += player1DiceRoll;
                }
            } else {
                System.out.println("You exceeded 21 count.");
            }

            if (player2Sum <= 21) {
                System.out.println(name2 + ", would you like to throw?");
                decision = scanner.next();
                if (decision.equalsIgnoreCase("y")) {
                    player2DiceRoll = diceRolls.player2ThrowCalculation();
                    player2Sum += player2DiceRoll;
                }
            } else {
                System.out.println("You exceeded 21 count.");
            }
            //TODO margin
            System.out.println("\n");

            System.out.println(name1 + " threw " + player1DiceRoll + " total is: " + player1Sum + "\n");

            System.out.println(name2 + " threw " + player2DiceRoll + " total is: " + player2Sum + "\n");

            System.out.println("Round no. " + (round += 1) + " ended.\n+++++++++++++++++++++++++++\n");

            if (player1Sum <= 21 && player2Sum > 21) {
                System.out.println("Congratulation " + name1 + " you won!");
                System.out.println("                                  .''.\n" +
                        "      .''.      .        *''*    :_\\/_:     .\n" +
                        "     :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                        " .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\n" +
                        ":_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\n" +
                        ": /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\n" +
                        " '..'  ':::'     * /\\ *     .'/.\\'.   '\n" +
                        "     *            *..*         :\n" +
                        "      *\n" +
                        "      *");
            } else if (player2Sum <= 21 && player1Sum > 21) {
                System.out.println("Congratulation " + name2 + " you won!");
                System.out.println("                                  .''.\n" +
                        "      .''.      .        *''*    :_\\/_:     .\n" +
                        "     :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                        " .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\n" +
                        ":_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\n" +
                        ": /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\n" +
                        " '..'  ':::'     * /\\ *     .'/.\\'.   '\n" +
                        "     *            *..*         :\n" +
                        "      *\n" +
                        "      *");

            } else if (player2Sum > 21 && player1Sum > 21) {
                System.out.println("No winner, try again!");

            } else if (player2Sum == 21 && player1Sum == 21) {
                System.out.println("You are both winner, congratulation!");
                System.out.println("                                  .''.\n" +
                        "      .''.      .        *''*    :_\\/_:     .\n" +
                        "     :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                        " .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\n" +
                        ":_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\n" +
                        ": /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\n" +
                        " '..'  ':::'     * /\\ *     .'/.\\'.   '\n" +
                        "     *            *..*         :\n" +
                        "      *\n" +
                        "      *");
            }

//            //TODO break out of the while loop
//            System.out.println("Would you like to throw again? Press y for yes, n for no.");
//            decision = scanner.next();
//            if (decision.equalsIgnoreCase("n")) {
//                break;
//            }
        }
    }
}
