package com.rubeshsv.bible.month1.week1.day7;

import java.util.Arrays;

public class ArrayAlgorithms {

    public static void main (String[] args){
        int[] arr  = {12,13,88,55,29, 10};
        int[] arr2 = {-5, -2, -9};
        sum(arr);
        avg(arr);
        min(arr);
        max(arr);
        search(arr);
        reverse(arr);
        count(arr);
        dimensional(arr);
        maximum(arr2);
    }
    //Given an int[], compute and print its sum and average.
    public static void sum(int[] arr){
        int total = 0;
        for(int i = 0; i<arr.length; i++){
            total += arr[i];
        }
        System.out.println("Sum value is = "+total);
    }

    public static void avg (int[] arr){
        double avgResult = 0;
        int sumResult=0;
        for(int i=0; i<arr.length; i++){
            sumResult += arr[i];
        }
        avgResult = (double) sumResult/ arr.length;
        System.out.println("Average value is = "+avgResult);
    }

    //Find and print the maximum and minimum in the array.
    public static void min(int[] arr){
        int minResult = arr[0];
        for(int i=1; i<arr.length; i++){
            if(minResult>arr[i]){ //12,13
                minResult=arr[i];
            }
        }
        System.out.println("Minimum value is = "+minResult);
    }

    public static void max(int[] arr){
        int maxResult = arr[0];
        for(int i=1; i<arr.length; i++){
            if(maxResult<arr[i]){ //12,13
                maxResult =arr[i];
            }
        }
        System.out.println("Maximum value is = "+maxResult);
    }

    //Linear search: read a target number from the user and print its index, or "not found".
    public static void search(int[] arr){
        int searchResult = -1;
        int searchingNumber = 88;
        for (int i =0; i< arr.length; i++){
            if(searchingNumber==arr[i]){
                searchResult = i;
            }
        }
        if(searchResult!=-1){
            System.out.println("Target value found at arr index of "+searchResult);
        } else {
            System.out.println("Target value not found");
        }
    }

    //Reverse the array in place and print it before and after.
    public static void reverse(int[] arr){
        System.out.println("Before Reverse : "+Arrays.toString(arr));
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left]; //0
            arr[left] = arr[right]; //
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("after reverse : "+ Arrays.toString(arr) );
    }

    //Count and print how many elements are even.
    public static void count(int[] arr){
    int countResult = 0;
    for(int i =0; i<arr.length; i++){
        if(arr[i]%2==0){
            countResult = countResult+1;
        }
    }
    System.out.println("Even Element count is : "+countResult);
    }

    //Create a 2×3 2D array and print it row by row.
    public static void dimensional (int[] arr){
        int[][] grid = {{1,2,3},{4,5,6}};
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[r].length; c++){
                System.out.print(grid[r][c]+" ");
            }
            System.out.println("");
        }
    }

    //Predict-then-verify: declare int max = 0; and find the max of {-5, -2, -9}.
    // Predict the output as a comment, run it, then explain what went wrong. Ans: Input is all in negative, if we initialize the max =0; it will compare with the 0 and negative value. And then the result will be 0, since all our input is negative. To resolve this we should initialize the max as arr[0]
    public static void maximum(int[] arr2){
        int max = arr2[0];
        for(int i =0; i<arr2.length; i++){
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        System.out.println("Maximum value of arr2 is : "+max);
    }

}
