package com.rubeshsv.bible.month1.week1.day5;

public class MethodBasics {

    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);

        greet("Rubesh S");

        int squareResult = square(5);
        int cubeResult = cube(5);
        System.out.println("Square value is " + squareResult);
        System.out.println("Cube value is " + cubeResult);

        boolean isEvenResult = isEven(8);
        System.out.println(isEvenResult);

        double avgResult =  average(3, 2, 10);
        System.out.println(avgResult);

        int rectangle = area(16, 18);
        System.out.println(rectangle);

        int square1 = area(19);
        System.out.println(square1);

        int passByValue =  5;
        changeIt(passByValue);
        System.out.println(passByValue);
    }

    //1. Write int add(int a, int b) that returns the sum. Call it from main and print the result.
    // (Interview tag: the "helper method" basics every coding problem builds on.)
    public static int sum(int x, int y) {
        return (x + y);
    }

    //2. Write void greet(String name) that prints "Hello, NAME!". Call it with your name.
    // (Tests the void vs return distinction — a method that acts but returns nothing.)
    public static void greet(String name) {
        System.out.println("Hello " + name+" !");
    }

    //3. Write int square(int n) and int cube(int n).
    // In main, print the square and cube of 5. (Building block for "Power of a number" problems.)
    public static int square(int n) {
        return (n * n);
    }

    public static int cube(int n) {
        return (n * n * n);
    }

    //4. Write boolean isEven(int n) that returns true/false (don't print inside the method — return it, then print in main).
    // (Interview tag: reusable predicate behind FizzBuzz and the "Even or Odd" screening warm-up.)
    public static boolean isEven(int n) {
        return (n%2==0);
    }

    //5. Write double average(int a, int b, int c) that returns the average of three ints.
    // (Interview tag: the integer-division trap — remember (double) cast from Day 2, or the average comes out wrong.)
    public static double average(int a, int b, int c) {
        return ((double) (a + b + c) / 3);
    }

    //6. Overloading: write two methods named area — area(int side) for a square, and area(int length, int width) for a rectangle.
    // Call both from main. (Interview tag: method overloading — same name, different parameters.)
    public static int area(int side) {
        return (side*side);
    }

    public static int area(int length, int width) {
        return (length * width);
    }

    //7. Predict-then-verify: write void changeIt(int x) { x = 999; }. In main, set a variable to 5, call changeIt on it, then print the variable.
    // Predict (as a comment) whether it changed, run it, and explain why. (Interview tag: pass-by-value — the concept we just dug into.)
    public static void changeIt(int x)
    {
        x=999; //primitive arguments. so it have seperate duplicate copy of this. if user set a variable to 5, it will print 5 as this 999 is a duplicate copy. until user add return x=999, the main method value will be taken
    }


}
