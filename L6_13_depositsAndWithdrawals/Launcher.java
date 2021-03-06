package com.company.L6_13_depositsAndWithdrawals;

import java.util.Scanner;
import java.io.*;


public class Launcher {
    public static void main(String[] args) throws IOException {

        DepoAndWithdr depoAndWithdr = new DepoAndWithdr();


        //TODO tu nastavujem cestu k citaniu zo suboru
        File depositFile = new File("E:/IT/Java/Kakra/src/com/company/L6_13_depositsAndWithdrawals/deposits.txt");
        File withdrawalFile = new File("E:/IT/Java/Kakra/src/com/company/L6_13_depositsAndWithdrawals/withdrawals.txt");


        //TODO tu citam zo suboru(ov) podla cesty, ktoru som nastavil vyssie
        Scanner depositInput = new Scanner(depositFile);
        Scanner withdrawalInput = new Scanner(withdrawalFile);


        //TODO while loop na citanie dat zo suboru riadok po riadku, preto while loop
        while (depositInput.hasNext()) {
            depoAndWithdr.depositsFunction(depositInput.nextDouble());
        }

        //TODO while loop na citanie dat zo suboru riadok po riadku, preto while loop
        while (withdrawalInput.hasNext()) {
            depoAndWithdr.getWithdrawalFunction(withdrawalInput.nextDouble());
        }

        depositInput.close();
        withdrawalInput.close();

        System.out.println(depoAndWithdr);
    }
}
