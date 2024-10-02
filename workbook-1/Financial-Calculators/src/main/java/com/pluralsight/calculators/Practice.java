package com.pluralsight.calculators;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("What is Your first number: ");
        int number1 = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.print(" What is your Second Number: ");
        int number2 = inputScanner.nextInt();
        int equal = number1 + number2;
        System.out.println(" Your added value is " + equal);
    }

}
