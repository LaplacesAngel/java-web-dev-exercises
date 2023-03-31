package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;



public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> paulsNums = new ArrayList<>();
        ArrayList<String> paulsWords = new ArrayList<>();
        //List<String> suesseList = new ArrayList<String>(Arrays.asList(ArrayPractice.greenSuesse.split("\\.")));
        //ArrayList<Integer> evens = new ArrayList<>();

        int num = 1;

        do {
            paulsNums.add(num);
            num++;
        } while (num < 11);

        //System.out.println(paulsNums);

        int sum = sumEven(paulsNums);

        System.out.println(sum);

        paulsWords.add("Hi");
        paulsWords.add("Hibiojoba");
        paulsWords.add("Hilikeiki");
        paulsWords.add("Hawai");
        paulsWords.add("Hilltoptown");
        paulsWords.add("Mantoon");
        paulsWords.add("Brittany");
        paulsWords.add("H");

        ArrayListExercise.hasNum(paulsWords);


    }



        public static void hasNum(ArrayList<String> paulsWords) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length of the word to return");
            Integer num = input.nextInt();

            for (String word : paulsWords) {
                if (word.length() == num) {
                    System.out.println(word);
                }
            }
        }
        public static int sumEven(ArrayList<Integer> paulsNums) {
            int evenSum = 0;
            for (int number : paulsNums) {
                if (number % 2 == 0) {
                    //evens.add(number);
                    evenSum += number;
                }
            }
            return evenSum;
        }

}