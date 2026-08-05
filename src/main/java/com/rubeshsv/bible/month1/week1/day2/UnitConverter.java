package com.rubeshsv.bible.day2;

import java.time.Month;
import java.util.Scanner;
import java.time.LocalDate;

public class UnitConverter {
    public static void main(String[] args) {
        /** Requirement :FR1 — Temperature: Celsius → Fahrenheit : Prompt the user to enter a temperature in Celsius.
         * FR2 — Currency: Rupees → USD
         * FR3 — Distance: Kilometers → Miles
         * For Final - UPPER_SNAKE_CASE instantly signals "this is a constant, it won't change."
         * A reader scanning the code knows at a glance. Consistency matters — a reviewer would flag the mismatch.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius : ");
        double celsius = scanner.nextDouble();
        final double CELSIUS_TO_FAHRENHEIT_RATIO = 9.0 / 5;
        final double FAHRENHEIT_OFFSET = 32.0;
        double fahrenheit = celsius * CELSIUS_TO_FAHRENHEIT_RATIO + FAHRENHEIT_OFFSET;
        System.out.println("Conversion of " + celsius + "°C" + " to Fahrenheit is = " + fahrenheit + "°F");

        System.out.print("Enter an amount in rupees : ");
        double rupees = scanner.nextDouble();
        System.out.print("Enter the current USD exchange rate");
        double usdExchangeRate = scanner.nextDouble();
        double usdAmount = rupees / usdExchangeRate;
        int currentDate = LocalDate.now().getDayOfMonth();
        Month currentMonth = LocalDate.now().getMonth();
        int currentYear = LocalDate.now().getYear();
        System.out.println("On " + currentDate + "-" + currentMonth + "-" + currentYear + " INR : " + rupees + " is USD : " + usdAmount);

        System.out.print("Enter a distance in kilometers : ");
        double kilometers = scanner.nextDouble();
        final double KM_TO_MILES = 0.621371;
        double miles = kilometers * KM_TO_MILES;
        System.out.println(kilometers + " KM is " + miles + " miles");

        scanner.close();
    }
}
