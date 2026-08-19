package com.rubeshsv.bible.month1.week2.day2;

public class Palindrome {
    public static void main(String[] args){
        String sentence1 = "madlam";
        int left = 0; //0
        int right = sentence1.length()-1; //4
        boolean palindromeResult = true;
        while (left < right) {
            if(sentence1.charAt(left)!=sentence1.charAt(right)){
                palindromeResult=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("The Word "+ sentence1 +" palindrome is = "+palindromeResult);

        //reverse and print
        String sentence2 = "rubesh";
        StringBuilder sb = new StringBuilder();
        for(int i=sentence2.length()-1; i>=0; i--){
            sb.append(sentence2.charAt(i));
        }
        String result = sb.toString();
        System.out.println("After reverse the result is : "+result);
        if(sentence2.equals(result)){
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is not palindrome");
        }

        //in-build reverse
        String inBuiltReverse = new StringBuilder(sentence2).reverse().toString();
        if(inBuiltReverse.equals(sentence2)){
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is not palindrome");
        }
    }
}
