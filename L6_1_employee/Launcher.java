package com.company.L6_1_Employee;

public class Launcher {
    public static void main(String[] args) {

        Employee employee01 = new Employee("Susan Meyers",47899,"Accounting", "Vice President");
        Employee employee02 = new Employee("Mark Jones",39119,"IT","Programmer");
        Employee employee03 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");

        System.out.println(employee01);
        System.out.println(employee02);
        System.out.println(employee03);

    }
}
