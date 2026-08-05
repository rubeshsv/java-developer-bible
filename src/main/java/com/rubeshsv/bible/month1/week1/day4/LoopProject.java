package com.rubeshsv.bible.month1.week1.day4;

import java.util.Scanner;

public class LoopProject {
    public static void main (String[] args)
    {
        //Multiplication table: ask the user for a number, print its table from ×1 to ×10 using a for loop.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int result = 0;
        for(int i=1; i<=10; i++)
        {
            result = num * i;
            System.out.println(num+" * "+i+" = "+result);
        }

        //Sum & average: ask how many numbers, then read that many with a loop, and print their sum and average (mind integer vs double division — Day 2 lesson!).
        System.out.print("Enter the number to find sum and average = ");
        int totalNumbers = scanner.nextInt();
        int n = 0;
        for(int g=1; g<=totalNumbers; g++)
        {
            System.out.println("Enter number "+g+" is : ");
            int h = scanner.nextInt();
            n += h;
        }
        System.out.println("Sum = "+n);
        double avg = (double) n/totalNumbers;
        System.out.println("Average = "+avg);

        scanner.close();
    }
}
