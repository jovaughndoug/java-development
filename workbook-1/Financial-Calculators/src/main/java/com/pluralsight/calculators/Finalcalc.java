package com.pluralsight.calculators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Finalcalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" What calculator do you Need 1 for mortgage: 2 for CD: 3 for OA: ");
        int answer = input.nextInt();
        input.nextLine();

        //boolean amIdone = false;
        // int counter = answer;

        System.out.println(" You have now chosen your Caculator ");
        if (answer == 1) {

            Mortgagecalculator.main(args);
        } else if (answer == 2) {
            Cdcalc.main(args);

        } else if (answer == 3) {
            OrdinaryAnnuity.main(args);

        }


    }

}
