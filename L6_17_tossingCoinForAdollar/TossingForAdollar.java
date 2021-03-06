package com.company.L6_17_tossingCoinForAdollar;

public class TossingForAdollar {

    private final double QUARTER = 0.25;
    private final double DIME = 0.1;
    private final double NICKEL = 0.05;

    private double quarterToss;
    private double dimeToss;
    private double nickelToss;

    private double sum;

    CoinClass coinClass = new CoinClass();

    public double calculation() {

        if (coinClass.coinToss() == "Heads") {
            quarterToss = QUARTER;
        } else {
            quarterToss = 0;
        }

        if (coinClass.coinToss() == "Heads") {
            dimeToss = DIME;
        } else {
            dimeToss = 0;
        }

        if (coinClass.coinToss() == "Heads") {
            nickelToss = NICKEL;
        } else {
            nickelToss = 0;
        }

        return sum = quarterToss + dimeToss + nickelToss;
    }

//    public double coinTossQuarter() {
//        if (coinClass.coinToss() == "Heads") {
//            quarterToss = QUARTER;
//        } else {
//            quarterToss = 0;
//        }
//        return quarterToss;
//    }
//
//    public double coinTossDime() {
//
//        if (coinClass.coinToss() == "Heads") {
//            dimeToss = DIME;
//        } else {
//            dimeToss = 0;
//        }
//        return dimeToss;
//    }
//
//    public double coinTossNickel() {
//
//        if (coinClass.coinToss() == "Heads") {
//            nickelToss = NICKEL;
//        } else {
//            nickelToss = 0;
//        }
//        return nickelToss;
//    }

//    public void sum(){
//        sum = quarterToss + dimeToss + nickelToss;
//        System.out.println(decimalFormat.format(sum));
//    }

//    MathContext math = new MathContext(1);//TODO pokus o zaukruhlenie
//    //TODO avsak toto zaokruhlilo desiate mesto za desatinnou ciarkou
//    //TODO cize som sa rozhodol ze to zaballim a poizijem decimal format.
//
//    private BigDecimal QUARTER = new BigDecimal(0.25);
//    private BigDecimal DIME = new BigDecimal(0.10);
//    private BigDecimal NICKEL = new BigDecimal(0.05);
//
//    private BigDecimal quarterToss = new BigDecimal(0);
//    private BigDecimal dimeToss = new BigDecimal(0);
//    private BigDecimal nickelToss = new BigDecimal(0);
//
//    private BigDecimal sum = new BigDecimal(0);
//
//    CoinClass coinClass = new CoinClass();
//
//    public BigDecimal coinTossQuarter() {
//        if (coinClass.coinToss() == "Heads") {
//            quarterToss = QUARTER;
//        } else {
//            quarterToss = BigDecimal.valueOf(0);
//        }
//        return quarterToss.round(math);
//    }
//
//    public BigDecimal coinTossDime() {
//
//        if (coinClass.coinToss() == "Heads") {
//            dimeToss = DIME;
//        } else {
//            dimeToss = BigDecimal.valueOf(0);
//        }
//        return dimeToss.round(math);
//    }
//
//    public BigDecimal coinTossNickel() {
//
//        if (coinClass.coinToss() == "Heads") {
//            nickelToss = NICKEL;
//        } else {
//            nickelToss = BigDecimal.valueOf(0);
//        }
//        return nickelToss.round(math);
//    }
//
//    public void sum(){
//        sum = quarterToss.add(dimeToss).add(nickelToss);
//        System.out.println(sum);
//    }

}
