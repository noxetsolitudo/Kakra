package com.company.L7_2_payroll;

public class Payroll {

    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private final int NUMBER_OF_EMPLOYEES = employeeId.length;
    private double[] hours;
    private double[] payRate;
    private double[] wages;

    public void calculateWages() {
        for (int employeeIndex = 0; employeeIndex < NUMBER_OF_EMPLOYEES; employeeIndex++) {
            wages[employeeIndex] = hours[employeeIndex] * payRate[employeeIndex];
        }
    }

    public double getEmplyeeWagesById(int employeeIdGiven){
        for (int employeeIndex = 0; employeeIndex < NUMBER_OF_EMPLOYEES; employeeIndex++) {
            if (employeeId[employeeIndex] == employeeIdGiven){
                return wages[employeeIndex];
            }
        }
        return -1;
    }


    public Payroll() {
        hours = new double[NUMBER_OF_EMPLOYEES];
        payRate = new double[NUMBER_OF_EMPLOYEES];
        wages = new double[NUMBER_OF_EMPLOYEES];
    }
}
