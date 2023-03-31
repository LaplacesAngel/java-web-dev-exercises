package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studio {

    public static void main(String[] args) {

        HashMap<Character, Integer> characterCount = new HashMap<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of words, any string, any words");
        String quote = input.nextLine();
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String cleanQuote = quote.replaceAll("[^A-Za-z]", "");
        char[] charactersInString = cleanQuote.toCharArray();
        //System.out.println(quote);
        //System.out.println(charactersInString);
        //int count = 1;

        for (Character letter : charactersInString) {

            if (!characterCount.containsKey(letter)) {
                characterCount.put(letter, 1);
            } else {
                int currentCount = characterCount.get(letter);
                characterCount.put(letter, currentCount + 1);
            }

            }

          for (Map.Entry<Character, Integer> letterPair : characterCount.entrySet()) {
              System.out.println(letterPair.getKey() + ": " + letterPair.getValue());
        }
        }
    }