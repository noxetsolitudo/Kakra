package com.company.L6_15_rouletteWheelColour;

public class RoulettePocket {

    public RoulettePocket(int number) {
        this.number = number;
    }

    private int number;
    private String pocketColour;

//    public String pocketColour() {
//        if (number == 0) {
//            pocketColour = "The colour is 'Green'!";
//        } else if (number >= 1 && number <= 10) {
//            if (number % 2 != 0) {
//                pocketColour = "The colour is 'Red'!";
//            } else {
//                pocketColour = "The colour is 'Black'!";
//            }
//        } else if (number >= 19 && number <= 28) {
//            if (number % 2 != 0) {
//                pocketColour = "The colour is 'Red'!";
//            } else {
//                pocketColour = "The colour is 'Black'!";
//            }
//        } else if (number >= 11 && number <= 18) {
//            if (number % 2 != 0) {
//                pocketColour = "The colour is 'Black'!";
//            } else {
//                pocketColour = "The colour is 'Red'!";
//            }
//        } else if (number >= 29 && number <= 36) {
//            if (number % 2 != 0) {
//                pocketColour = "The colour is 'Black'!";
//            } else {
//                pocketColour = "The colour is 'Red'!";
//            }
//        } else {
//            pocketColour = "The number you entered is out of range of 0-36.";
//        }
//        return pocketColour;
//    }

    public String pocketColour() {
        if (number == 0) {
            pocketColour = "The colour is 'Green'!";
        } else if (number >= 1 && number <= 10 || number >= 19 && number <= 28) {
            if (number % 2 != 0) {
                pocketColour = "The colour is 'Red'!";
            } else {
                pocketColour = "The colour is 'Black'!";
            }
        } else if (number >= 11 && number <= 18 || number >= 29 && number <= 36) {
            if (number % 2 != 0) {
                pocketColour = "The colour is 'Black'!";
            } else {
                pocketColour = "The colour is 'Red'!";
            }
        } else {
            pocketColour = "Number out of range 0-36";
        }
        return pocketColour;
    }

    public String toString() {
        return pocketColour;
    }
}

