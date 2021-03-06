package com.company.L7_1_rainfall_3;

import javax.swing.*;

public class TestingClass {

    public static void userFillingTheArray(double[] arrayGiven) {
        for (int index = 0; index < arrayGiven.length; index++) {
            String userStringValueGiven = JOptionPane.showInputDialog("Please enter the rainfall for month number " + (index + 1));
            double userDouble = Double.parseDouble(userStringValueGiven);
            arrayGiven [index] = userDouble;
        }
    }


    public static void main(String[] args) {

    }
}
