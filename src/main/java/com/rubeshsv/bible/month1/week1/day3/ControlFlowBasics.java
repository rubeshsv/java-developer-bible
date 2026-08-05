package com.rubeshsv.bible.day3;
import java.util.Scanner;

public class ControlFlowBasics {
    public static void main(String[] args) {
        //Declare an int score. Print its letter grade using if / else if / else: A (≥90), B (≥75), C (≥50), else Fail.
        int score = 76;
        if (score >= 90) {
            System.out.println("PASS | Your Score is = " + score+" and Your Grade is A");
        } else if (score >= 75) {
            System.out.println("PASS | Your Score is = " + score+" and Your Grade is B");
        } else if (score >= 50) {
            System.out.println("PASS | Your Score is = " + score+" and Your Grade is C");
        } else {
            System.out.println("FAIL | Your Score is = " + score);
        }

        //Read an integer from the user (Scanner) and print whether it's even or odd (hint: n % 2 == 0).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check if its an ODD or EVEN Number : ");
        int number = scanner.nextInt();
        String result = (number%2==0) ? "Its an EVEN NUMBER" : "Its an ODD NUMBER";
        System.out.println(result);


        //Read an integer and print whether it's positive, negative, or zero.
        System.out.print("Enter an number to check if its POSITIVE or NEGATIVE or ZERO");
        int numToCheckPositiveOrNegative = scanner.nextInt();
        if (numToCheckPositiveOrNegative>0){
            System.out.println(numToCheckPositiveOrNegative+" is POSITIVE NUMBER");
        } else if (numToCheckPositiveOrNegative==0) {
            System.out.println(numToCheckPositiveOrNegative+" number is Zero");
        } else {
            System.out.println(numToCheckPositiveOrNegative+" is NEGATIVE NUMBER");
        }

        //Given int age and boolean hasLicense, print "Can drive" only if age ≥ 18 AND hasLicense is true (use &&).
        int age = 19;
        boolean hasLicense = false;
        if(age>=18 && hasLicense){
            System.out.println("Can Drive");
        } else {
            System.out.println("Should not Drive");
        }

        //Use the ternary operator to set a String to "Even" or "Odd" for a given number, and print it.
        int numberToCheckEvenOrODD = 18;
        String checkNum = (numberToCheckEvenOrODD%2==0) ? "an EVEN NUMBER" : "an ODD NUMBER";
        System.out.println(numberToCheckEvenOrODD+" is "+checkNum);

        //Predict-then-verify: write int x = 3; int y = x++ + ++x;, predict x and y, add your prediction as a comment, then run and check.
        //y=3+5 = 8 and x = 5
        int x=3;
        int y=x++ + ++x;
        System.out.println("Value of X is "+x);
        System.out.println("Value of Y is "+y);

        scanner.close();
    }
}
