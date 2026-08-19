package com.rubeshsv.bible.month1.week2.day2;

public class StringBuilderDemo {
    public static void main(String[] args){
        //Create an empty StringBuilder.
        StringBuilder sample = new StringBuilder();

        //Use a loop to append the numbers 1 through 5 to it (so it builds "12345").
        for(int i=1; i<6; i++){
            sample.append(i);
        }
        System.out.println(sample);

        //Convert it to a String with .toString() and print the result.
        String result = sample.toString();
        System.out.println(result);

        //Then append one more piece — the word " done" — and print again to show it changed in place (no new object needed).
        sample.append(" done");
        System.out.println(sample);
    }
}
