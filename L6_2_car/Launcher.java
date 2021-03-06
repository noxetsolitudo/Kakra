package com.company.L6_2_car;

public class Launcher {
    public static void main(String[] args) {

        Car car = new Car(2006,"Mazda");
        car.accelerate();
        car.brake();
        car.list();
        System.out.println(car);
        car.setMake("Honda");
        car.setYearModel(1996);
        System.out.println(car);
    }
}
