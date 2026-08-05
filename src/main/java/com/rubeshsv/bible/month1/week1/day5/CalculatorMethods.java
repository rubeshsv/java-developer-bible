package com.rubeshsv.bible.month1.week1.day5;

import java.util.Scanner;

public class CalculatorMethods {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the operation you want to do (+ , - , * , / ) : ");
        char operation = scanner.next().charAt(0);
        System.out.print("Enter the second number : ");
        double secondNumber = scanner.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (operation) {
            case '+' -> result = add(firstNumber, secondNumber);
            case '-' -> result = subtract(firstNumber, secondNumber);
            case '*' -> result = multiply(firstNumber, secondNumber);
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("Error: cannot divide by zero");
                    valid = false;
                } else {
                    result = divide(firstNumber, secondNumber);
                }
            }
            default -> {                             // FR: handle invalid operator
                System.out.println("Invalid operator: " + operation);
                valid = false;
            }
        }
        if(valid){
            System.out.println("Result is : "+result);
        }
    }

    //FR1 — Four operation methods, each taking two doubles and returning a double:
    public static double add(double a, double b){
        return(a+b);
    }
    public static double subtract(double a, double b){
        return(a-b);
    }
    public static double multiply(double a, double b){
        return(a*b);
    }
    public static double divide(double a, double b){
        return(a/b);
    }

}
