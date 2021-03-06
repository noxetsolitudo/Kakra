package com.company.L7_1_rainfall_2;

import javax.swing.JOptionPane;

public class RainfallTest {

    public static void arrayFilling ( double [] arrayGiven){
        String userInputString;
        double userMonthlyInputFigures;
        for (int index = 0; index < arrayGiven.length; index++) {
            userInputString = JOptionPane.showInputDialog("Please enter the figure of rainfall for the month " + index +1);
            userMonthlyInputFigures = Double.parseDouble(userInputString);
            arrayGiven [index] = userMonthlyInputFigures;
        }
    }


    public static void main(String[] args) {

        final int MONTHS_OF_RAINFALL = 12;

        double [] rainfallStats = new double[MONTHS_OF_RAINFALL];

        arrayFilling(rainfallStats);

        Rainfall rainfall = new Rainfall(rainfallStats);

    }
}