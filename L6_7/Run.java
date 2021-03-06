package com.company.L6_7;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double _radius = 0;

        System.out.println("Please enter the choosen radius of the circle: ");
        _radius = scanner.nextDouble();
        Circle circle = new Circle();


        circle.calculation(_radius);

        System.out.println(circle);
    }
}
