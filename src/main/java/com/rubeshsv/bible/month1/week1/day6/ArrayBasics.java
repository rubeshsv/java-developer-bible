package com.rubeshsv.bible.month1.week1.day6;

public class ArrayBasics {

    public static void main(String[] args)
    {
        //Create an int[] of 5 numbers using a literal. Print the first and last element (use length - 1 for the last). (Basic indexing.)
        int[] arr = {10,20,30,40,50};
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        //Print all elements using a classic for loop (with index).
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        //Print all elements again using a for-each loop. Notice the difference.
        for(int score:arr){
            System.out.println(score);
        }

        //Change the element at index 2 to a new value, then print the whole array again.
        arr[2]=35;
        for(int updatedScore:arr){
            System.out.println(updatedScore);
        }

        //Print the array's length.
        System.out.println(arr.length);

        //Predict-then-verify: access arr[arr.length] (one past the end).
        // Predict what happens (as a comment), then run it. (Tag: boundary/out-of-bounds — a QA favorite.)
        System.out.println(arr[arr.length-1]); //length is 5, now we are calling arr[5] as we have only arr[index]=4 max, so we will get outOfBound Exception. Instead we can try with length-1 in the array

        //Reference behavior: do int[] b = a; b[0] = 999; then print a[0].
        // Predict, then run — explain why in a comment. (Tag: arrays are objects — ties to pass-by-value.)
        int[] a = {12,22,32,42,52};
        int[] b =a;
        b[0]=999;
        System.out.println(a[0]);
        //initial value of a[0]=12, then we created an array called b copy a. so b is copy of a = both have same reference is stack. if user update b, automatically a value got update.now the o/p is 999
    }
}
