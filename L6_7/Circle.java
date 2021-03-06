package com.company.L6_7;

import java.text.DecimalFormat;

public class Circle {

    private double radius = 0;
    private double area = 0;
    private double circumference = 0;
    private double diameter = 0;

    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    DecimalFormat decimalFormat2 = new DecimalFormat("#0.0");

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public void calculation(double value){
        radius = value;
        diameter = radius * 2;
        area = Math.PI * Math.pow(radius, 2);
        circumference = Math.PI * radius;
    }

    public String toString(){
        return "The circle parameters are: \nRadius: " + decimalFormat2.format(radius) + "\nDiameter: " + decimalFormat2.format(diameter) + "\nArea: " + decimalFormat.format(area)
                + "\nCircumference: " + decimalFormat.format(circumference);
    }



}
