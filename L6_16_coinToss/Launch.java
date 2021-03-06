package com.company.L6_16_coinToss;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of loops");
        int maxLoops = scanner.nextInt();

        Toss toss = new Toss();
        toss.loop(maxLoops);

        System.out.println(toss);

    }
}
