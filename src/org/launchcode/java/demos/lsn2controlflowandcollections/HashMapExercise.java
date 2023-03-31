package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {
        //It takes in student names and ID numbers (as integers) instead of names and grades.
        //The keys should be the IDs and the values should be the names.
        //Modify the roster printing code accordingly.

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName = null;

        System.out.println("Enter a student, press Enter to finish");

        do {
            System.out.println(studentName);
            System.out.print("Student Name: ");
            System.out.println(studentName);
            studentName = input.nextLine();
            System.out.println(studentName);

            if (!studentName.equals("")) {
                System.out.print("Student ID: ");
                int studentID = input.nextInt();
                students.put(studentID, studentName);;
                System.out.println(studentName + studentID);
                input.nextLine();
                System.out.println(studentName + studentID);

            }
            //System.out.println("Student ID = " + studentID);
        } while (!studentName.equals(""));
        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " Student name: " + student.getValue());
        }

    }
}
