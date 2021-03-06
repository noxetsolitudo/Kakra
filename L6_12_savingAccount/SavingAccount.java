package com.company.L6_12_savingAccount;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SavingAccount {

    private double startingBalance = 0;
    private double balance = 0;
    private int numberOfMonths = 0;
    private double withdrawal = 0;
    private double deposit = 0;
    private double annuallInterestPercent = 0;
    private double monthlyInterestsAmount = 0;
    private double balanceTotal = 0;
    private int depositCount = 0;
    private int withdrawalCount = 0;

    public SavingAccount(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#0.00");

    public void whatIs() {
        System.out.println("What is the annual interest rate % ?");
        annuallInterestPercent = (scanner.nextDouble()) / 100;
        System.out.println("What is your starting balance?");
        startingBalance = scanner.nextDouble();
        balance = startingBalance;
    }

    public double depositing() {
        System.out.println("How much money did you deposit this month?");
        deposit = scanner.nextDouble();
        depositCount++;
        return balance += deposit;
    }

    public double withdrawing() {
        System.out.println("How much money did you withdrew this month?");
        withdrawal = scanner.nextDouble();
        withdrawalCount++;
        return balance -= withdrawal;
    }

    public double monthlyInterestCal() {
        return monthlyInterestsAmount = balance * annuallInterestPercent / 12;

    }

    public double balanceTotalCal() {
        return balanceTotal = balance + monthlyInterestsAmount;
    }

    public String toString() {
        return "Annual interest rate is: " + annuallInterestPercent +
                "\nStarting balance: " + startingBalance +
                "\nDeposit:" + deposit +
                "\nWithdrawal : " + withdrawal +
                "\nMonthly interests: " + decimalFormat.format(monthlyInterestsAmount) +
                "\nBalance:" + decimalFormat.format(balance) +
                "\nBalance total: " + decimalFormat.format(balanceTotalCal()) +
                "\nNumber of months: " + numberOfMonths +
                "\nNumber of deposits: " + depositCount +
                "\nNumber of withdrawals: " + withdrawalCount;
    }
}
