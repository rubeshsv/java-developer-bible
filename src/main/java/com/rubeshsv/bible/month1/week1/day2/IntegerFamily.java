package com.rubeshsv.bible.day2;

public class IntegerFamily {
    public static void main(String[] args) {
        //Declare an int for your age and print it.
        int age = 27;
        System.out.println("My age is " + age);

        //Declare a long for the world population (~8 billion) with the L suffix and underscores; print it.
        long worldPopulation = 8_000_000_000L;
        System.out.println("World Population is " + worldPopulation);

        //Print Integer.MAX_VALUE, then print Integer.MAX_VALUE + 1 and observe the overflow. Write a one-line comment explaining what you see.
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Int Max Value is " + maxInt);
        int overFlowValue = maxInt + 1;
        System.out.println("Int After Over Flow value is : " + overFlowValue);

        //Try long big = 10000000000; without the L — read the compile error, then fix it by adding L.
        long bigNumber = 10000000000L;
        System.out.println("Long number is " + bigNumber);

    }
}