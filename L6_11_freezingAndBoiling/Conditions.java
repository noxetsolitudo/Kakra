package com.company.L6_11_freezingAndBoiling;

public class Conditions extends Data {

    private double value = 0;

    public Conditions(double value) {
        this.value = value;
    }

//    public void runner() {


    boolean isEthylFreezing() {
        if (value <= super.ETHYL_FREEZING) {
            return true;
        }
        return false;
    }

    public boolean isEthylBoiling() {
        if (value >= super.ETHYL_BOILING) {
            return true;
        }
        return false;
    }

    public void ethylFreezingAnswer() {
        if (isEthylFreezing() == true) {
            System.out.println("Ethyl will freeze");
        } else {
            System.out.println("Ethyl won't freeze");
        }
    }

    public void ethylBoilingAnswer() {
        if (isEthylBoiling() == true) {
            System.out.println("Ethyl will boil");
        } else {
            System.out.println("Ethyl won't boil");
        }
    }

    public boolean isOxygenFreezing() {
        if (value <= super.OXYGEN_FREEZING) {
            return true;
        }
        return false;
    }

    public boolean isOxygenBoiling() {
        if (value >= super.OXYGEN_BOILING) {
            return true;
        }
        return false;
    }

    public void oxygenFreezingAnswer() {
        if (isOxygenFreezing() == true) {
            System.out.println("Oxygen will freeze");
        } else {
            System.out.println("Oxygen won't freeze");
        }
    }

    public void oxygenBoilingAnswer() {
        if (isOxygenBoiling() == true) {
            System.out.println("Oxygen will boil");
        } else {
            System.out.println("Oxygen won't boil");
        }
    }

    public boolean isWaterFreezing() {
        if (value <= super.WATER_FREEZING) {
            return true;
        }
        return false;
    }

    public boolean isWaterBoiling() {
        if (value >= super.WATER_BOILING) {
            return true;
        }
        return false;
    }

    public void waterFreezingAnswer() {
        if (isWaterFreezing() == true) {
            System.out.println("Water will freeze");
        } else {
            System.out.println("Water won't freeze");
        }
    }

    public void waterBoilingAnswer() {
        if (isWaterBoiling() == true) {
            System.out.println("Water will boil");
        } else {
            System.out.println("Water won't boil");
        }
    }
}

