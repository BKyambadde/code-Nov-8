package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double radius, circumference, area;

        System.out.println("WE ARE GONNA GET THE AREA AND CIRCUMFERENCE OF A CIRCLE OFA RADIUS YOU ENTER");
        System.out.println("ENTER THE RADIUS");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        scanner.close();

        //circumference
        circumference = 2*Math.PI*radius;
        System.out.printf("THE CIRCUMFERENCE OF A CIRCLE OF RADIUS %.2f IS %.3f\n\n",radius,circumference);

        //area
        area = Math.PI*radius*radius;
        System.out.printf("THE AREA OF A CIRCLE OF RADIUS %.2f IS %.4f",radius,area);

    }
}
