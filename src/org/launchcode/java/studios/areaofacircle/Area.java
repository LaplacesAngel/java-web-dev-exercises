package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Area {
    public static void main(String[] args) {
        try {
            double pi = 3.14;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a radius");
            double radius = input.nextDouble();

            while (radius < 0) {
                {
                    System.out.println("Enter a positive number");
                    radius = input.nextDouble();
                }

                double Area = Circle.getArea(radius);

                System.out.println("Area is " + Area);
            }
        }
         catch (InputMismatchException e) {
             System.out.print("Invalid input. Re-start program." );
            }
    }
}

