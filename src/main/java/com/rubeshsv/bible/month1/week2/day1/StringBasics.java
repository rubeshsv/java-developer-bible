package com.rubeshsv.bible.month1.week2.day1;

public class StringBasics {
    public static void main(String[] args){
        /* Exercise 1 — basic methods
        Make a String String name = " Rubesh Kumar "; (note the spaces). Print: its length (with the spaces), the trimmed version (spaces removed), the upper-case version.
         */
        System.out.println("*****************");
        System.out.println("Exercise 1 Begins");
        String name = " Rubesh Kumar "; //total length including spaces = 14
        //its length (with the spaces)
        System.out.println("Length before trim() = "+name.length());
        //the trimmed version (spaces removed)
        name=name.trim();
        System.out.println("Length After trim() = "+name.length());
        System.out.println(name);
        //the upper-case version.
        System.out.println(name.toUpperCase());
        System.out.println("Exercise 1 Ends");
        System.out.println("*****************");

        /*
        Exercise 2 — index and last character. Make String word = "Amazon";.
        Print: the character at index 0, the last character — but do not hardcode the number. Work it out from length().
         */
        System.out.println("Exercise 2 Begins");
        String word = "Amazon";
        //the character at index 0
        System.out.println(word.charAt(0));
        //the last character — but do not hardcode the number
        System.out.println(word.charAt(word.length()-1));
        System.out.println("Exercise 2 Ends");
        System.out.println("*****************");

        /*
        Exercise 3 — split an email into two parts. Make String email = "srubeshg@gmail.com";.
        Print: the username (the part before @), the domain (the part after @).
         */
        System.out.println("Exercise 3 Begins");
        String email = "srubeshg@gmail.com";
        int i=0;
        int findAt = email.indexOf("@");
        String userName = email.substring(i,findAt) ;
        String domain = email.substring(findAt+1);
        System.out.println(domain);
        System.out.println(userName);
        System.out.println("Exercise 3 Ends");
        System.out.println("*****************");

        /*
        Exercise 4 — compare Strings correctly. Make String p = "java"; and String q = "JAVA";.
        Print three things: p == q, p.equals(q), a case-insensitive comparison (make both the same case, then .equals()).
        Write your prediction as a comment next to each line first, then run it.
        Interview tag: this is the "why doesn't == work for Strings?" question — extremely common.
        */
        System.out.println("Exercise 4 Begins");
        String p = "java"; //This p hold holds the reference of java
        String q = "JAVA"; // This q hold the new reference of JAVA
        System.out.println(p==q); // both have diff reference and we are using ==. so it compares the refernce, it will throw false
        System.out.println(p.equals(q)); //we are using .equals(). so it will compare the actual value of two reference - both have different cases with same word Java is cases sensitive language. so it will throw the false
        q=q.toLowerCase(); // now q value changed to complete lower cases
        System.out.println(p.equals(q));//both have same value and the same case - return true now
        System.out.println("Exercise 4 Ends");
        System.out.println("*****************");

        /*
        Exercise 5 — the immutability trap (predict-then-verify)
        Write exactly this, then predict the output as a comment, run it, and explain what happened:
         */
        System.out.println("Exercise 5 Begins");
        String s = "hi";
        s.concat(" there");        // concat = join another String onto the end
        System.out.println(s); //hi - we haven't capture the concat to s
        s=s.concat(" there");
        System.out.println(s);//we have captured the concatination of s. so now it will return as hi there
        System.out.println("Exercise 5 Ends");
        System.out.println("*****************");
    }
}
