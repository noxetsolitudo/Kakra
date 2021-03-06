package com.company.L7_1_rainfall_2;

public class Rainfall {

    private double[] rainfallStats;//TODO ARRAY to be fed by user
    private double totalRainfall;
    private double averageRainfall;

    public double getTotalRainfall() {
        for (int index = 0; index < rainfallStats.length; index++) {
            totalRainfall = totalRainfall + rainfallStats[index];
        }
        return totalRainfall;
    }

    public double getAverageRainfall() {
        averageRainfall = totalRainfall / rainfallStats.length;
        return averageRainfall;
    }

    //TODO method to find out the most rain and consequently the most rainy month. Index specifies the number of the month.
    public int getMostRainMonth() {
        int mostRainMonth = 1;
        double mostRain = rainfallStats[0];
        for (int index = 0; index < rainfallStats.length; index++) {
            if (mostRain < rainfallStats[index]) {//TODO condition to find what is the most rain, we will get position of the array specified by index
                mostRain = rainfallStats[index];
                mostRainMonth = index + 1;//TODO we had to add 1 to precisely define the month because of array indexing starting from 0.
            }
        }
        return mostRainMonth;//TODO we are returning the month with the most rain
    }

    //TODO method to find out the least rain ..., the rest is the same as above
    public int getLeastRainMonth() {
        int leastRainMonth = 1;
        double leastRain = rainfallStats[0];
        for (int index = 0; index < rainfallStats.length; index++) {
            if (leastRain > rainfallStats[index]) {
                leastRain = rainfallStats[index];
                leastRainMonth = index + 1;
            }
        }
        return leastRainMonth;
    }

//TODO methods to find out the AMOUNT of max and min rain fall

//    public double getMostRain() {
//        for (int index = 0; index < rainfallStats.length; index++) {
//            if (mostRain < rainfallStats[index]) {
//                mostRain = rainfallStats[index];
//            }
//        }
//        return mostRain;
//    }
//
//    public double getLeastRain() {
//        for (int index = 0; index < rainfallStats.length; index++) {
//            if (leastRain > rainfallStats[index]) {
//                leastRain = rainfallStats[index];
//            }
//        }
//        return leastRain;
//    }


    //TODO constructor
    public Rainfall(double[] rainfallStatsGiven) {

        this.rainfallStats = new double[rainfallStatsGiven.length];//TODO size of ARRAY is dynamically set this way by .length of rainfallStatsGiven.

        for (int index = 0; index < rainfallStatsGiven.length; index++) {//TODO this is the way of FEEDING the ARRAY from the input from brackets.
            rainfallStats[index] = rainfallStatsGiven[index];
        }
    }
}
