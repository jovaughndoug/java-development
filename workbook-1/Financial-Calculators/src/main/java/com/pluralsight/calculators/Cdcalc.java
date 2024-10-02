package com.pluralsight.calculators;

import java.util.Scanner;

public class Cdcalc {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("How Much is your deposit? ");
        double principal = inputScanner.nextDouble();
        inputScanner.nextLine();
        System.out.println(" How many years ? ");
        double loanLength = inputScanner.nextDouble();
        inputScanner.nextLine();
        System.out.println("What is your Interest rate? ");
        double interestRate = inputScanner.nextDouble();
        interestRate = interestRate / 100.;
        double a = 1 + interestRate/365;
        double b = 365 * loanLength;
        double cdcalc = principal * Math.pow(a,b);
        double interestgain = cdcalc - principal;
        System.out.printf(" Your CD's Ending balance will be   $%8.2f\n", cdcalc);
        System.out.printf(" Your Loan interest amount gained is   $%8.2f", interestgain);
    }
    }
