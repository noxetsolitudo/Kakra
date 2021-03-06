package com.company.L6_15_rouletteWheelColour;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int _pocket = 0;

        System.out.println("Please enter the pocket number: ");
        _pocket = scanner.nextInt();

        RoulettePocket roulettePocket = new RoulettePocket(_pocket);

        roulettePocket.pocketColour();

        System.out.println(roulettePocket);

    }
}
