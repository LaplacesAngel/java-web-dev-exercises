package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius");
        double radius = input.nextDouble();
        //double A = pi * radius * radius;
        double Area = getArea(radius);

        System.out.println("Area is " + Area);

    }
}
