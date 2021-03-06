package com.company.L6_1_Employee;

public class Employee {

    private String name = new String();
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public String toString(){
        return "Employee name: " + name + "\nID number: " + idNumber + "\nDepartment :" + department + "\nPosition: " + position + "\n";
    }

}
