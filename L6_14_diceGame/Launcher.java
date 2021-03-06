package com.company.L6_14_diceGame;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loops;

        System.out.println("Please enter the number of loops");
        loops = scanner.nextInt();

        Operations operations = new Operations();

        operations.loop(loops);

        System.out.println(operations);

        operations.comparison();

    }

}
