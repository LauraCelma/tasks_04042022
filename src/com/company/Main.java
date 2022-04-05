package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        // write your code here
        // main.task1_2();
        // main.task3();
        // main.task4();
        // main.task5();
        //main.task6();
        //main.task7();
        main.task8();
    }

    void task1_2() {
        System.out.println("task1_2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int var = scanner.nextInt();
        System.out.println("Your number is: " + var);

        if (var % 2 == 0) {
            System.out.println("The entered number is even");
        } else {
            System.out.println("The entered number is odd");
        }

    }

    void task3() {
        System.out.println("task3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int var3 = scanner.nextInt();
        if (var3 == 0) {
            System.out.println("The  number is equal to 0");
        } else if (var3 > 0) {
            System.out.println("The entered number greater than 0");
        } else {
            System.out.println("The entered number less than 0");
        }
    }

    void task4() {
        System.out.println("task4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input height");
        int height = scanner.nextInt();
        System.out.println("Please input weight");
        float weight = scanner.nextFloat();
        if (height > 150 && weight < 180) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I am sorry you cant go");
        }
    }

    void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a temperature");
        float tempInCelsius = scanner.nextFloat();
        double Farenheit = 1.8f * tempInCelsius + 32.0f;
        System.out.println("Temperature in celsius is: " + Farenheit);
    }

    void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a variable: ");
        double income = scanner.nextDouble();
        double tax;
        if (income <= 85528.00) {
            tax = income * 18 % -556.02;
            System.out.println("Your personal income tax is: " + tax);
        } else
            tax = 14839.02 + (income - 85528.00) * 0.32;
        {
            System.out.println("Your personal income tax is: " + tax);
        }
    }

    void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write an amount between 100.00 and 10 000.00: ");
        double LoanAmount = scanner.nextDouble();
        System.out.println("Please write a number of installments (between 6 and 48): ");
        int numberOfInstallments = scanner.nextInt();
        if (LoanAmount >= 100.00 && LoanAmount <= 10000.00 && numberOfInstallments >= 6 && numberOfInstallments <= 48) {
            System.out.println("LoanAmount is: " + LoanAmount);
            System.out.println("Number Of Installments is: " + numberOfInstallments);
        } else {
            LoanAmount = 5000.00;
            numberOfInstallments = 36;
        }

        if (LoanAmount >= 100.00 && LoanAmount <= 10000.00 && numberOfInstallments >= 6 && numberOfInstallments <= 12) {
            System.out.println("Monthly loan is1: " + (LoanAmount + 0.025 * LoanAmount));
        } else if (LoanAmount >= 100.00 && LoanAmount <= 10000.00 && numberOfInstallments >= 13 && numberOfInstallments <= 24) {
            System.out.println("Monthly loan is2: " + (LoanAmount + 0.5 * LoanAmount));
        } else if (LoanAmount >= 100.00 && LoanAmount <= 10000.00 && numberOfInstallments >= 25 && numberOfInstallments <= 48) {
            System.out.println("Monthly loan is3: " + (LoanAmount + 0.10 * LoanAmount));
        } else
            System.out.println("Try again according to the rules!");

    }

    void task8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of month: ");
        int numberOfMonth = scanner.nextInt();
        String MonthValid= ((numberOfMonth >= 1) && (numberOfMonth <= 12)) ?  "True": "False";
        System.out.println("MonthValid: "+ MonthValid);

        System.out.println("Please enter the year: ");
        int Year = scanner.nextInt();
        String YearValid= ((Year >= 1000)& (Year <= 1999)) ?  "True": "False";
        System.out.println("YearValid: "+ YearValid);

        System.out.println("Please enter the year and find out is it leap year: ");
        int LeapYear = scanner.nextInt();
        if ((LeapYear % 400== 0) || (LeapYear % 4 == 0 && LeapYear % 100 != 0))

        {
            System.out.println("LeapYearValid: True");
        }
        else
        System.out.println("LeapYearValid: False");

    }

}
