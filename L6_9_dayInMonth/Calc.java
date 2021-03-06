package com.company.L6_9_dayInMonth;

import java.util.Scanner;

public class Calc {

    private Scanner scanner = new Scanner(System.in);

    private int month;
    private int year;
    private int daysNumber;
    private String leap;

    public void start() {
        System.out.println("Please enter a month (1-12): ");
        month = scanner.nextInt();

        while (month < 1 || month > 12) {
            System.out.println("Please enter a correct month (1-12): ");
            month = scanner.nextInt();
        }
        System.out.println("Please enter a year: ");
        year = scanner.nextInt();

        while (year < 0) {
            System.out.println("Please enter a correct year: ");
            year = scanner.nextInt();
        }
        scanner.close();
    }

    public boolean isLeapYearCalc() {

        if (year % 4 == 0) {                               //Step 1
            if (year % 100 == 0) {                         //Step 2
                if (year % 400 == 0) {                     //Step 3
                    return true;                           //Step 4 year is a leap year
                } else {
                    return false;                          //Step 5 not a leap year
                }
            } else {
                return true;                               //Step 4 year is a leap year
            }
        } else {
            return false;                                  //Step 5 not a leap year
        }
    }

    public int daysInMonthYear() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysNumber = 31;//jan,mar,may,july,august,october,december
                break;
            case 2:
                if (isLeapYearCalc() == false) {
                    daysNumber = 28;
                    leap = "REGULAR";
                } else {
                    daysNumber = 29;
                    leap = "LEAP";
                }
                daysNumber = 29;//feb --> make check if a leap year
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysNumber = 30;//april,jun,september,november
        }
        return daysNumber;
    }

    public String toString() {
        return "The month you picked has " + daysNumber + " days and the year " + year + " is a " + leap + " year";
    }
}

/*    1 If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
      2 If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
      3 If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
      4 The year is a leap year (it has 366 days).
      5 The year is not a leap year (it has 365 days).*/

