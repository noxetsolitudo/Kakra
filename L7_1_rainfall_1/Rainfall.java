package com.company.L7_1_rainfall_1;

public class Rainfall {

    private double[] rainfallData;

    public double getRainfallTotal() {
        double rainfallTotal = 0;

        for (int index = 0; index < rainfallData.length; index++) {
            rainfallTotal += rainfallData[index];
        }
        return rainfallTotal;
    }

    public double getRainfallAverage() {
        return getRainfallTotal() / rainfallData.length;
    }

    public int getMostRainMonth() {
        double mostRain = rainfallData[0];
        int mostRainMonth = 1;

        for (int index = 0; index < rainfallData.length; index++) {
            if (mostRain < rainfallData[index]) {
                mostRainMonth = index + 1;
            }
        }
        return mostRainMonth;
    }

    public int leastRain() {
        double leastRain = rainfallData[0];
        int leastRainMonth = 1;

        for (int index = 0; index < rainfallData.length; index++) {
            if (leastRain > rainfallData[index]) {
                leastRainMonth = index + 1;
            }
        }
        return leastRainMonth;
    }

    public Rainfall(double[] rainfallDataGiven) {

        rainfallData = new double[rainfallDataGiven.length];

        for (int index = 0; index < rainfallDataGiven.length; index++) {
            rainfallData[index] = rainfallDataGiven[index];
        }
    }
}


