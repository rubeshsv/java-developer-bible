package com.rubeshsv.bible.month1.week1.day2;

import java.util.Scanner;
import java.time.LocalDate;

public class ScannerBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user for their name (nextLine) and age (nextInt), then print "Hello NAME, you are AGE years old."
        System.out.print("Enter you Name :");
        String name = scanner.nextLine();
        System.out.print("Enter you age :");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + " , you are " + age + " years old.");

        //Ask for two integers and print their sum, and their a / b as a decimal (remember the cast trick from Session 2).
        System.out.print("Enter the number for value1 : ");
        int value1 = scanner.nextInt();
        System.out.print(" Enter the number for value2 : ");
        int value2 = scanner.nextInt();
        int sum = value1 + value2;
        System.out.println("Sum of Value1: " + value1 + " and Value2: " + value2 + " is " + sum);
        double division = (double) value1 / value2;
        System.out.println("Division of Value 1 and Value 2 is " + division);

        //Ask for a temperature in Celsius (nextDouble) and print it in Fahrenheit: F = C * 9/5 + 32. (Trap: 9/5 in int math = 1! Fix it — use 9.0/5 or cast.)
        System.out.print("Enter the temperature in Celsius");
        double temperature = scanner.nextDouble();
        final double CELSIUS_TO_FAHRENHEIT_RATIO = 9.0 / 5;
        double fahrenheit = temperature * CELSIUS_TO_FAHRENHEIT_RATIO + 32;
        System.out.println("Fahrenheit is " + fahrenheit);

        //Ask the user for their birth year (nextInt), compute and print their approximate age (current year − birth year).
        System.out.print("Enter you birth year : ");
        int birthYear = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        int currentAge = currentYear - birthYear;
        System.out.println("Current age is : " + currentAge);

        scanner.close();
    }
}
