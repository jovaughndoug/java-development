package com.pluralsight.calculators;

import java.util.Scanner;

public class Mortgagecalculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("How Much is your principal? ");
        double principal = inputScanner.nextDouble();
        inputScanner.nextLine();
        System.out.println("What is your loan term ? ");
        double loanLength = inputScanner.nextDouble();
        inputScanner.nextLine();
        System.out.println("What is your Interest rate? ");
        double interestRate = inputScanner.nextDouble();

//        double principalAmount = principal;
//        double loanAmount = loanLength;
//        double interestAmount = interestRate;
        interestRate = interestRate/100.;
        double paymentEqual = principal * interestRate/12;
        double paymentEqual1 = 1 - (1 + interestRate/12);
        double a = 1 + interestRate/12;
        double b = - loanLength * 12;
        double paymentEqual2 = Math.pow(a,b);
        double paymentEqual3 = 1 - paymentEqual2;
        double monthlyPayment = paymentEqual/paymentEqual3;
        double interestAmount = (monthlyPayment*loanLength*12) - principal;
        System.out.printf(" Your Monthly Payment is  $%8.2f\n", monthlyPayment);
        System.out.printf(" Your Loan interest amount is  $%8.2f", interestAmount);





    }



    }
