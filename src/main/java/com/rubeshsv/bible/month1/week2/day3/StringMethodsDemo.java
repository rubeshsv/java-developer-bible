package com.rubeshsv.bible.month1.week2.day3;

public class StringMethodsDemo {

    /* ## Exercise: `StringMethodsDemo`
    * **Interview relevance:** basic string parsing/cleaning — shows up constantly as a warm-up or a sub-step in bigger problems (e.g. "parse this input line").
    * **Setup:** new class `StringMethodsDemo` in package `com.rubeshsv.bible.month1.week2.day2` (same Strings day — or bump to a new package if you prefer, your call).
    * **What the program should do:**
        1. Start with `String sentence = "the quick brown fox";`
        2. contains — print whether it contains `"quick"` (expect `true`) and `"cat"` (expect `false`).
        3. replace — make a new String with every space swapped for `-` (→ `"the-quick-brown-fox"`), print it, **and** print the original `sentence` afterward to prove it's unchanged.
        4. split — split `sentence` on the space `" "` into a `String[]`, then loop over the array and print each word on its own line. Also print how many words there are (`.length`).

     * Everything needed is now taught:** `contains`, `replace`, `split`, arrays, a loop, `.length`. Nothing new.
     * Think first (predict-then-verify):** write your predicted output as comments before running — especially: after step 3, what will the original `sentence` print as?
     */
    public static void main(String[] args){
        String word = "the quick brown fox";
        System.out.println(word);
        System.out.println(word.contains("quick"));
        System.out.println(word.contains("cat"));
        String removeSpace = word.replace(" ", "-");
        System.out.println(removeSpace);
        String[] splitWord = word.split(" ");
        for(int i =0; i<splitWord.length; i++ ){
            System.out.println(splitWord[i]);
        }
        System.out.println(splitWord.length);
        // for-each: "for each String w in splitWord" — visits every element, no index, can't off-by-one. Use when you only need the value, not the position.
        for(String a : splitWord){
            System.out.println(a);
        }
    }
}
