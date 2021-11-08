package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        long factorial = 1;
        System.out.println("WE ARE GONNA FIND THE FACTORIAL OF A NUMBER YOU WANT.");
        System.out.println("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        scanner.close();

        if (x < 0)
            System.out.println("THE FACTORIAL OF THAT NUMBER IS IMPOSSIBLE.");
        else if (x <= 1)
            System.out.printf("THE FACTORIAL OF %d IS %d", x, factorial);
        else {
            for (int i = x; i >= 2; i--) {
                factorial *=i;
            }
            System.out.printf("THE FACTORIAL OF %d IS %d", x, factorial);
        }
    }
}
