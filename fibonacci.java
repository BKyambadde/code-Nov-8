package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// FIBONACCI SERIES
        int input, x = 0, y = 1, sum;
        System.out.println("WE ARE GONNA DO A FIBONACCI SERIES UPTO A SMALL NUMBER OF SERIES YOU WANT.");
        System.out.println("Enter a number of series: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        scanner.close();

        for( int i = 1; i<=input; i++){
            System.out.printf("%d   ", x);
            sum = x + y;
            y = x;
            x = sum;
        }

    }
}
