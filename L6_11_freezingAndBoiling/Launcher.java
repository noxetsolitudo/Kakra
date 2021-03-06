package com.company.L6_11_freezingAndBoiling;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        double _value;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the temperature");
        _value = scanner.nextDouble();

        Conditions conditions = new Conditions(_value);

        conditions.ethylFreezingAnswer();
        conditions.ethylBoilingAnswer();

        conditions.oxygenFreezingAnswer();
        conditions.oxygenBoilingAnswer();

        conditions.waterFreezingAnswer();
        conditions.waterBoilingAnswer();

    }
}
