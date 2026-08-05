package com.rubeshsv.bible.month1.week1.day4;

import java.util.Scanner;

public class LoopBasics {
    public static void main(String[] args) {
        //Print numbers 1 to 10 using a for loop.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Print 1 to 10 using a while loop (notice you manage init/update yourself).
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        //Print the even numbers from 1 to 20 (hint: i % 2 == 0, or step by 2).
        for (int b = 1; b <= 20; b++) {
            if (b % 2 != 0) {
                continue;
            }
            System.out.println(b);
        }

        //Read a number n from the user and print the sum of 1 to n (accumulate in a variable).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int c = 1; c <= n; c++) {
            sum += c;
        }
        System.out.println(sum);

        //Use break: loop 1 to 100 but stop as soon as you hit a number divisible by 7 (print it, then break).
        for (int d = 1; d <= 100; d++) {
            if (d % 7 == 0) {
                System.out.println("Breaks at : " + d);
                break;
            }
        }

        //Use continue: print 1 to 20 but skip multiples of 3.
        for (int e = 1; e <= 20; e++) {
            if (e % 3 == 0) {
                continue;
            }
            System.out.println(e);
        }

        //do-while menu: repeatedly ask the user to enter a number;
        // keep going until they enter 0; then print "Goodbye." (This is the classic do-while use case.)
        int f;
        do {
            System.out.println("Enter a Number : ");
            f = scanner.nextInt();
        } while (f != 0);
        System.out.println("Goodbye");

        //Predict-then-verify: what does this print? Predict as a comment, then run:
        for (int g = 0; g < 3; g++) { //g=0 and g is less than 3 = init and conditions is pass - entering the for loop
            for (int j = 0; j < 2; j++) { // nested loop check : j=0 and j is less than 2 = = init and conditions is pass - entering into loop
                System.out.println("g=" + g + ", j=" + j); //g=0, j=0 g=0, j=1
            }
        }
    }
}
