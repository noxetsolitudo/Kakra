package com.company.L6_2_car;

public class Car {

    private int yearModel = 0;
    private String make = null;
    private int speed = 0;


    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
//        this.speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int accelerate(){
        for (int i = 1; i < 6; i++) {
            speed +=5;
            System.out.println("Accelerating: " + speed + " km/h" + "cycle no.:" +  i);
        }
        return speed;
    }

    public int brake(){
        for (int i = 1; i < 6; i++) {
            speed -=5;
            System.out.println("Braking: " + speed + " km/h" + " cycle no.:" +  i);

        }
        return speed;
    }

    public void list(){
        System.out.println("Final speed " + speed + " km/h");
    }

    public String toString(){
        return "Year model: " + yearModel + "\nMake: " + make;
    }
}