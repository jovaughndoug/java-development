package com.pluralsight.donut;

import java.util.Scanner;

// we LOVE our delimiters!!!
public class Donut {
    static double price = .25;

    public static double getTotalPrice(int numberOfDonuts) {

        return price * numberOfDonuts;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Welcome How many donuts do you want? :");
        int numberOfDonuts = inputScanner.nextInt();
        inputScanner.nextLine();


        System.out.println("your donuts cost:");

        double totalPrice = getTotalPrice(12);
        System.out.println(totalPrice + " dollars");
        System.out.printf("In dollars, that would be $%4.2f", totalPrice);
        System.out.printf(" \nThe square root of 5 is %8.5f", Math.sqrt(5.0));
    }
}
