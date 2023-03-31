package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));
        System.out.println(students);
        // Get student grades
        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);

        ArrayList<String> planets = new ArrayList<>();
        System.out.println(planets);
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");

        System.out.println(planets);
        System.out.println(planets.size());
        System.out.println(planets.contains("Earth"));
        System.out.println(planets.indexOf("Mars"));
        Collections.sort(planets);
        System.out.println(planets);
        String[] planetsArray = new String[planets.size()];
        planets.toArray(planetsArray);
        System.out.println(planetsArray);
    }
}
