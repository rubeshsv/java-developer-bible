package com.rubeshsv.bible.month1.week1.day4;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args)
    {
        //(divisible by 3 AND 5) → "FizzBuzz" and (divisible by 3) → "Fizz" and (divisible by 5) → "Buzz" and else → the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            } else if (i%3==0)
            {
                System.out.println("Fizz");
            } else if (i%5==0)
            {
                System.out.println("Buzz");
            }else
            {
                System.out.println(i);
            }
        }
    }
}
