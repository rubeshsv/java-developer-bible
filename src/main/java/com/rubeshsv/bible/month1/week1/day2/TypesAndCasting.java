package com.rubeshsv.bible.day2;

public class TypesAndCasting {
    public static void main(String[] args) {
        //Cast a double (e.g. 9.99) to an int and print it. What happened to the decimal — rounded or chopped? Comment your finding.
        double a = 9.99;
        int wholePart = (int) (a); //chopped - it becomes 9, ignored after decimal point values. This is called Narrow
        System.out.println(wholePart);

        //Fix integer division: compute 7 / 2 two ways — once as plain int (see 3), once by casting to double (see 3.5). Print both.
        int num1 = 7;
        int num2 = 2;
        int division1 = num1 / num2; //Return 3 (Not Accurate)
        double division2 = (double) num1 / num2; //Casting - Retrun accrurate value as we saved this as decimal
        System.out.println("Division 1 (Plain) : " + division1);
        System.out.println("Dvision 2 (Double) " + division2);

        //Print 0.1 + 0.2. Observe it's not exactly 0.3. Write a one-line comment explaining why.
        double value1 = 0.1;
        double value2 = 0.2;
        double value3 = value1 + value2;
        System.out.println("Sum of Value 1 : " + value1 + " and Value 2 :" + value2 + " is = " + value3);
        if (Math.abs(value3 - 0.3) < 1e-9) {
            System.out.println("Comparison is PASS");
        } else {
            System.out.println("Comparison is FAIL");
        }

        //Declare a char for the first letter of your name. Print it, then print its numeric code (cast to int).
        char firstLetter = 'R';
        System.out.println("First Letter of My Name is : " + firstLetter);
        int numCode = firstLetter;
        System.out.println("Numeric code of my first Letter is : " + numCode);

        //Compute (char)('a' + 3) and print it. Predict the letter first.
        char char1 = 'a';
        char char2 = (char) (char1 + 3);
        System.out.println("Value of char1 is : " + char1 + " and Value of char2 (char+3) is : " + char2);

        //Declare a boolean isAdult set to age >= 18 (use your age variable). Print it.
        int age1 = 19;
        boolean isAdult = age1 >= 18;
        System.out.println("Age is : " + age1 + " Boolen result is : " + isAdult);

        //Declare a final constant PI = 3.14159, use it to compute a circle's area (PI * radius * radius) for radius = 5, and print it.
        // Then try reassigning PI and observe the compile error.
        final double PI = 3.14159;
        //PI=3.15; //java: cannot assign a value to final variable PI
        int radius = 5;
        double circleArea = (double) (PI * radius * radius);
        System.out.println("Value of PI is : " + PI + " and Value of radius is : " + radius + " And the Circle area (pi*radius*radius) is : " + circleArea);
    }
}
