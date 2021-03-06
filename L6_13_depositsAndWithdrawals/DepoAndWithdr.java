package com.company.L6_13_depositsAndWithdrawals;

import java.text.DecimalFormat;

public class DepoAndWithdr {

    private double balance = 500;
    private double deposit = 0;//TODO toto je tu zbytocne
    private double withdrawal = 0;//TODO toto je tu zbytocne
    private int depositCounter = 0;
    private int withdrawalCounter = 0;

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public double depositsFunction(double value) {
        //TODO nastavil som counter tak aby ratal kola od 1, inak by to bolo od nuly ak depositCounter ++
        depositCounter +=+1;
        System.out.println("Get deposit no." + depositCounter);
        return balance += value;
    }

    public double getWithdrawalFunction(double value) {
        //TODO -"-
        withdrawalCounter +=+1;
        System.out.println("Get withdrawal no." + withdrawalCounter);
        return balance -= value;
    }

    public String toString() {
        System.out.println("------To string------");
        return "The balance is " + decimalFormat.format(balance) +
                "\nNumber of deposits: " + depositCounter +
                "\nNumber of withdrawals: " + withdrawalCounter;
    }


}
