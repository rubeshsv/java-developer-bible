package com.rubeshsv.bible.month1.week1.day3;

import java.util.Scanner;

public class SwitchBasics {
    public static void main(String[] args) {
        //Read an int day (1–7) from the user and print the day name using a classic switch (with break). Include a default for invalid input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number between 1 - 7 to display the according day : ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number Entered");
        }

        //Rewrite exercise 1 using the modern arrow syntax (->). Notice how much cleaner it is.
        System.out.print("Please enter the number between 1 - 7 to display the according day :  ");
        int dayNumberModernExercise = scanner.nextInt();
        switch (dayNumberModernExercise) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Number Entered");
        }

        //Read an int month (1–12) and print its season using grouped cases (e.g. case 12, 1, 2 -> "Winter").
        System.out.print("Please enter the month number between 1 - 12 to display its season :  ");
        int month = scanner.nextInt();
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            default -> System.out.println("Autumn");
        }
        // Use a switch expression to assign a String grade description: 'A' -> "Excellent", 'B' -> "Good", 'C' -> "Average", default -> "Needs improvement". Print it.
        System.out.println("Enter a grade (A/B/C/...): ");
        char grade = scanner.next().charAt(0);
        System.out.println("You entered: " + grade);
        String description = switch (grade) {
            case 'A', 'a' -> "Excellent";
            case 'B', 'b' -> "Good";
            case 'C', 'c' -> "Average";
            default -> "Needs Improvement";
        };
        System.out.println(description);

        //Predict-then-verify: write a classic switch with a missing break on case 1, feed it 1, and predict the output before running. Confirm the fall-through.
        //output with 1 and remainng cases output also it will print until it finds break, else it will print all the switch cases
        int test = 1;
        switch (test) {
            case 1:
                System.out.println("One");      // matches
            case 2:
                System.out.println("Two");      // no break above → falls through, ALSO prints
            case 3:
                System.out.println("Three");    // ALSO prints
                break;
        }

        scanner.close();
    }
}
