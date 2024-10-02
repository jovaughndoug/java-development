package com.pluralsight.calculators;

import java.util.Scanner;

public class OrdinaryAnnuity {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("How Much is your Monthly payment? ");
        double payment = inputScanner.nextDouble();
        inputScanner.nextLine();
        System.out.println("What is your term ? ");
        double loanLength = inputScanner.nextDouble();
        inputScanner.nextLine();
        System.out.println("What is your expected Interest rate? ");
        double interestRate = inputScanner.nextDouble();
        interestRate = interestRate / (12. * 100.);
        double a = 1 + interestRate;
        double b = - 12 * loanLength;
        double c = Math.pow(a, b);
        double d = 1 - c;
        double e =d/ interestRate;
        double f = payment * e;


        System.out.printf(" The present value of the annuity would be $%8.2f\n", f);
    }
    }
