package com.company.L6_12_savingAccount;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of months you want to run the saving account for:");
        int _numberOfMonths = scanner.nextInt();

        SavingAccount savingAccount = new SavingAccount(_numberOfMonths);

        savingAccount.whatIs();

        for (int i = 1; i <= _numberOfMonths; i++) {

            System.out.println("Month no." + i);
            savingAccount.depositing();
            savingAccount.withdrawing();
            savingAccount.monthlyInterestCal();
        }

        System.out.println(savingAccount);
    }
}
