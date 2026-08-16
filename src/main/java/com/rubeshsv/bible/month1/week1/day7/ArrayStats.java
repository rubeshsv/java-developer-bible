package com.rubeshsv.bible.month1.week1.day7;

/*
 * ArrayStats — computes statistics on an int array.
 * Design:
 *   - main: owns the data (arr), calls each method, prints results (the "manager")
 *   - sum(int[])     → returns total ......... O(n) time, O(1) space
 *   - average(int[]) → returns double mean ... O(n), O(1)  (casts to avoid int division)
 *   - max/min(int[]) → returns extreme ....... O(n), O(1)  (seed with arr[0])
 *   - reverse(int[]) → reverses in place ..... O(n), O(1)  (two-pointer swap)
 * Data flow: main → method(arr) → returns value → main prints.
 */

import java.util.Arrays;

public class ArrayStats {

    public static void main(String[] args){
        int[] arr = {26, 29, 18, 27, 11, 2, 66};
        System.out.println("Sum of given array is = "+sum(arr));
        System.out.println("Average of given array is = "+avg(arr));
        System.out.println("Maximum value of the given array is = "+max(arr));
        System.out.println("Minimum value of the given array is = "+min(arr));
        reverse(arr);
        System.out.println("Reverse of the given array is = "+ Arrays.toString(arr));
    }

    public static int sum(int[] arr){
        int sumResult = 0;
        for(int i =0; i<arr.length; i++){
            sumResult += arr[i];
        }
        return sumResult;
    }

    public static double avg(int[] arr){
        double avgResult = (double) sum(arr)/arr.length;
        return avgResult;
    }

    public static int max(int[] arr){
        int maxResult = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxResult){ //29>26:True..etc
                maxResult=arr[i]; //29..etc
            }
        }
        return maxResult;
    }

    public static int min(int[] arr){
        int minResult = arr[0];
        for(int i=0; i<arr.length; i++){
            if(minResult>arr[i]){
                minResult=arr[i];
            }
        }
        return minResult;
    }

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }
}
