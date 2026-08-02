package com.rubeshsv.bible.day2;

public class IntegerFamilyExercise {
    public static void main(String[] args) {

        // Declare a byte holding your favorite number (0–100), a short holding the year you were born, and an int holding a city's population.
        // Print all three with labels.
        byte favNumber = 21;
        short birthYear = 1999;
        int tirukkoyilurPopulation = 250000;
        System.out.println("My Favorite Number is " + favNumber);
        System.out.println("My Birth Year is " + birthYear);
        System.out.println("Tirukkoyilur City Population is : " + tirukkoyilurPopulation);
        System.out.println("Exercise 1 Completed");
        System.out.println("");

        //Print the maximum and minimum value of int, long, and byte using the built-in constants.
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value is : " + minByte);
        System.out.println("Maximum Byte Value is : " + maxByte);
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value is : " + minInt);
        System.out.println("Maximum Integer Value is : " + maxInt);
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Minimum Long Value is : " + minLong);
        System.out.println("Maximum Long Value is : " + maxLong);
        System.out.println("Exercise 2 Completed");
        System.out.println("");

        //Declare a long for the number of milliseconds in a day (24 × 60 × 60 × 1000 = 86,400,000).
        // Write it as a literal with underscores for readability, and print it.
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int milliSeconds = 1000;
        long hoursMilliSeconds = hours * minutes * seconds * milliSeconds;
        System.out.println("Milliseconds for : " + hours + " hours is : " + hoursMilliSeconds);
        System.out.println("Exercise 3 Completed");
        System.out.println("");

        //Byte overflow. Set a byte to its maximum value using Byte.MAX_VALUE.
        // Then add 1 to it (store in another byte — you may need to think about this) and print the result.
        // What do you predict happens before you run it? Write your prediction as a comment, then verify.
        // Hint: this is the same overflow idea as int, but at the much smaller byte boundary (127).
        byte maxValue = Byte.MAX_VALUE;
        System.out.println("Maximum value of Byte is " + maxValue);
        byte overFlowValue = (byte) (maxValue + 1);
        System.out.println("Over Flow Value is " + overFlowValue);
        System.out.println("Exercise 4 Completed");
        System.out.println("");

        //Arithmetic. Declare two int variables a = 15 and b = 4.
        // Print their sum, difference, product, a / b, and a % b (remainder).
        // Watch closely: what does 15 / 4 print — 3.75 or 3? Add a comment explaining why.
        int a = 15;
        int b = 4;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int divide = a / b;
        int divideReminder = a % b;
        System.out.println("Value of a is : " + a + " and Value of b is : " + b);
        System.out.println("Sum of a + b is " + sum);
        System.out.println("Difference of a - b is " + difference);
        System.out.println("Product of a * b is " + product);
        System.out.println("Division of a / b is " + divide);
        System.out.println("Division Reminder of a % b is " + divideReminder);
        System.out.println("Exercise 5 Completed");
        System.out.println("");

        //The int sum trap. Declare int bigA = 2_000_000_000; and int bigB = 2_000_000_000;.
        // Print bigA + bigB. The real answer is 4 billion — but what does it print, and why?
        // Then fix it so it prints correctly. Hint: think about which type can hold 4 billion, and where the overflow happens.
        int bigA = 2_000_000_000;
        int bigB = 2_000_000_000;
        System.out.println("Big Value of A is " + bigA + " and Big Value of B is " + bigB);
        long overFlowOfBigAB = (long) bigA + bigB;
        System.out.println("Sum of Big Value A and B is Exceeding int Max Value. So, Declaring the SUM value as Long");
        System.out.println("Sum of Big Value A + B is " + overFlowOfBigAB);
        System.out.println("Exercise 6 Completed");
        System.out.println("");

        //Age in seconds. Declare your age in years as an int.
        // Compute your approximate age in seconds (years × 365 × 24 × 60 × 60) and print it.
        // Trap: decide carefully whether the result fits in an int or needs a long.
        // Test both and see which one gives the correct number vs an overflowed one.
        // Explain your choice in a comment.
        int age = 27;
        System.out.println("My age is : " + age);
        long ageSeconds = (long) age * 365 * 24 * 60 * 60;
        System.out.println(age + "Age in Seconds : " + ageSeconds);
        System.out.println("Exercise 7 Completed");
        System.out.println("");
    }
}
