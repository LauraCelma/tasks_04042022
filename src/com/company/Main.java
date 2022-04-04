package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        task1();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task7() {
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int var = scanner.nextInt();
        System.out.println("Your number is: " + var);

        if (var % 2 == 0)
        {
            System.out.println("The entered number is even");
        }
        else
        {
            System.out.println("The entered number is odd");
        }

    }
    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int var3 = scanner.nextInt();
        if (var3 == 0)
        {
            System.out.println("The  number is equal to 0");
        }
        else if (var3 >0)
        {
            System.out.println("The entered number greater than 0");
        }
        else
        {
            System.out.println("The entered number less than 0");
        }
    }
    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input height");
        int height = scanner.nextInt();
        System.out.println("Please input weight");
        float weight = scanner.nextFloat();
        if (height > 150 && weight <180)
        {
            System.out.println("Fasten your seatbelt!");
        }
        else
        {
            System.out.println("I am sorry you cant go");
        }
    }
    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a temperature");
        float tempInCelsius = scanner.nextFloat();
        double Farenheit= 1.8 * tempInCelsius+32.0;
        System.out.println("Temperature in celsius is: " + Farenheit);
    }
    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a variable: ");
        double income = scanner.nextDouble();
        double tax;
        if (income <=85528.00 )
        {
            tax= income*18%-556.02;
            System.out.println("Your personal income tax is: " + tax);
        }
        else
            tax = 14839.02 + (income-85528.00) *0.32;
        {
            System.out.println ("Your personal income tax is: " + tax);
        }
    }
    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write an amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Please write a number of installments: ");
        int numberOfInstallments = scanner.nextInt();

        }
    }
}